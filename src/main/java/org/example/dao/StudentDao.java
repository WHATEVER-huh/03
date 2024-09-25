package org.example.dao;

import org.example.entity.Student;
import java.util.List;

public interface StudentDao extends BaseDao<Student> {
    List<Student> findByName(String name);
    List<Student> findByIdCard(String idCard);
    List<Student> findByCollege(String college);
    List<Student> findByMajor(String major);
    List<Student> findByClass(String studentClass);
}