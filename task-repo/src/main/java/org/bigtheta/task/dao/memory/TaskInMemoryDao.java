package org.bigtheta.task.dao.memory;

import org.bigtheta.task.core.domain.Status;
import org.bigtheta.task.core.domain.Task;
import org.bigtheta.task.dao.TaskDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class TaskInMemoryDao implements TaskDao {

    private Set<Task> tasks;

    public TaskInMemoryDao() {
        tasks = new HashSet<>();

        tasks.add(new Task(1, "buy bread", "main"));
        tasks.add(new Task(2, "buy milk", "main"));
        tasks.add(new Task(3, "call peter", "additional"));

    }

    @Override
    public List<Task> list() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Task find(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Task delete(int id) {
        Task target = find(id);
        target.setStatus(Status.deleted);
        return update(target);
    }

    @Override
    public Task create(Task task) {
        tasks.add(task);
        return task;
    }

    @Override
    public Task update(Task task) {
        tasks.stream()
                .filter(u -> u.getId().equals(task.getId()))
                .findFirst()
                .ifPresent(u -> u = task);

        return task;

    }
}
