package org.bigtheta.task.core.dao;

import java.util.List;

public interface BaseDao<T> {
    List<T> list();

    T find(long id);

    T delete(long id);

    T create(T user);

    T update(T user);
}

