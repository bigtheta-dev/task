package org.bigtheta.task.dao;

import java.util.List;

public interface BaseDao<T> {
    List<T> list();

    T find(int id);

    T delete(int id);

    T create(T user);

    T update(T user);
}
