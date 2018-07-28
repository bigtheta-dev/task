package org.bigtheta.task.core.service;

import org.bigtheta.task.core.domain.Task;

import javax.transaction.Transactional;
import java.util.List;

public interface TaskPersistenceService {
    @Transactional
    List<Task> list();

    @Transactional
    Task create(Task task);
}
