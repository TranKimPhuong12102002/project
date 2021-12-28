/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.model;

import com.qlhv.model.Student;
import java.util.Date;
public class Class {
    private int class_id;
    private Course course_id;
    private Student student_id;
    private Date day_begin;
    private boolean status;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public Course getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Course course_id) {
        this.course_id = course_id;
    }

    public Student getStudent_id() {
        return student_id;
    }

    public void setStudent(Student student_id) {
        this.student_id = student_id;
    }

    public Date getDay_begin() {
        return day_begin;
    }

    public void setDay_begin(Date day_begin) {
        this.day_begin = day_begin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
