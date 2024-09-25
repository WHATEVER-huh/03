package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.example.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/student")
public class StudentController extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("findById".equals(action)) {
            String studentId = request.getParameter("studentId");
            Student student = studentService.findById(studentId);
            request.setAttribute("student", student);
            request.getRequestDispatcher("/findByIdResult.jsp").forward(request, response);
        }
        // 处理其他操作
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            // 获取表单数据，创建 Student 对象
            Student student = new Student();
            student.setStudentId(request.getParameter("studentId"));
            // 设置其他属性
            studentService.add(student);
            response.sendRedirect("success.jsp");
        }
        // 处理其他操作
    }
}

