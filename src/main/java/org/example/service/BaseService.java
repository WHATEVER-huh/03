package org.example.service;

import java.util.List;

public interface BaseService<T> {
    void add(T t);
    void delete(String id);
    void update(T t);
    T findById(String id);
    List<T> findAll();
}
