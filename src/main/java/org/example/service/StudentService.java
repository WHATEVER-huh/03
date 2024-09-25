package org.example.service;

import org.example.entity.Student;
import java.util.List;

public interface StudentService extends BaseService<Student> {
    List<Student> findByName(String name);
    List<Student> findByIdCard(String idCard);
    List<Student> findByCollege(String college);
    List<Student> findByMajor(String major);
    List<Student> findByClass(String studentClass);
}