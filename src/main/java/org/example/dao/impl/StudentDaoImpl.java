package org.example.dao.impl;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class StudentDaoImpl implements StudentDao {

    @Override
    public void add(Student student) {
        String sql = "INSERT INTO student (student_id, name, gender, hometown, id_card, college, major, class) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getStudentId());
            pstmt.setString(2, student.getName());
            // 设置其他参数...
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Student> findByName(String name) {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student WHERE name = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getString("student_id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setHometown(rs.getString("hometown"));
                student.setIdCard(rs.getString("id_card"));
                student.setCollege(rs.getString("college"));
                student.setMajor(rs.getString("major"));
                student.setStudentClass(rs.getString("class"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    // 实现其他方法...
}
    // 实现其他方法...
    @Override
    public  Student findById(String id) {
        String sql = "SELECT * FROM student WHERE student_id = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getString("student_id"));
                // 设置其他属性
                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
