package org.bigtheta.task.rest.controller;

import org.bigtheta.task.core.domain.Task;
import org.bigtheta.task.core.service.TaskPersistenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private TaskPersistenceService taskPersistenceService;

    public TaskController(TaskPersistenceService taskPersistenceService) {
        this.taskPersistenceService = taskPersistenceService;

        taskPersistenceService.create(new Task( "buy bread", "main"));
        taskPersistenceService.create(new Task( "buy milk", "main"));
        taskPersistenceService.create(new Task( "call peter", "additional"));
        taskPersistenceService.create(new Task( "wait notifier", "main"));
    }

    @GetMapping("/task")
    public List<Task> getUsers() {
        return taskPersistenceService.list();
    }

}
