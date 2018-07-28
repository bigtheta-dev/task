package org.bigtheta.task.core.dao.persistence;

import org.bigtheta.task.core.domain.Task;
import org.bigtheta.task.core.dao.TaskDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

@Repository
public class TaskPersistenceDao implements TaskDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Task> list() {
        CriteriaQuery<Task> criteriaQuery = em.getCriteriaBuilder().createQuery(Task.class);

        @SuppressWarnings("unused")
        Root<Task> root = criteriaQuery.from(Task.class);

        return em.createQuery(criteriaQuery).getResultList();

    }

    @Override
    public Task find(long id) {
        return null;
    }

    @Override
    public Task delete(long id) {

        return null;
    }

    @Override
    public Task create(Task user) {
        em.persist(user);
        return user;
    }

    @Override
    public Task update(Task user) {
        return null;
    }
}
