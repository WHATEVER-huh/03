package org.example.dao;

import java.util.List;

public interface BaseDao<T> {
    void add(T t);
    void delete(String id);
    void update(T t);
    T findById(String id);
    List<T> findAll();
}
