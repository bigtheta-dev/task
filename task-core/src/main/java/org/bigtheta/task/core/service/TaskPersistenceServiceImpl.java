package org.bigtheta.task.core.service;

import org.bigtheta.task.core.domain.Task;
import org.bigtheta.task.core.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TaskPersistenceServiceImpl implements TaskPersistenceService {

    @Autowired
    private TaskDao taskDao;

    @Override
    @Transactional
    public List<Task> list() {
        return taskDao.list();
    }

    @Override
    @Transactional
    public Task create(Task task) {
        return taskDao.create(task);
    }
}
