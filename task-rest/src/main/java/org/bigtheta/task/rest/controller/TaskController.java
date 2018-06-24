package org.bigtheta.task.rest.controller;

import org.bigtheta.task.core.domain.Task;
import org.bigtheta.task.dao.TaskDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private TaskDao taskDao;

    public TaskController(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @GetMapping("/task")
    public List<Task> getUsers() {
        return taskDao.list();
    }

    @GetMapping("/task/{id}")
    public Task getUser(@PathVariable Integer id) {
        return taskDao.find(id);
    }
}
