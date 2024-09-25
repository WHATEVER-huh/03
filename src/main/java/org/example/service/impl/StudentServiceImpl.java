package org.example.service.impl;


import com.example.dao.StudentDao;
import com.example.dao.impl.StudentDaoImpl;
import com.example.entity.Student;
import com.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void add(Student student) {
        studentDao.add(student);
    }

    // 实现其他方法...
}
