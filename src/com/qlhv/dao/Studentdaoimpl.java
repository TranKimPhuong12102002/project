package com.qlhv.dao;
import com.qlhv.model.Student;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Studentdaoimpl implements Studentdao{

    @Override
    public List<Student> getlist() {
      Connection cons = DBConnect.getConnection();
      String sql = "SELECT * FROM student";
      List<Student> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setStudentID(rs.getString("student_id"));
                student.setGeneration(rs.getString("gen"));
                student.setPhoneNumber(rs.getString("phone"));
                student.setAddress(rs.getString("address"));
                student.setDob(rs.getString("dob"));
                student.setReligion(rs.getString("religion"));
                student.setGender(rs.getString("gender"));
                list.add(student);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        Studentdao studentdao = new Studentdaoimpl();
        System.out.println(studentdao.getlist());
    }
    
} 
