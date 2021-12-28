/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.model;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class Course {
    private int course_id;
    private String course_name;
    private String describe;
    private Date day_start;
    private Date day_end;
    private boolean status;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getDay_start() {
        return day_start;
    }

    public void setDay_start(Date day_start) {
        this.day_start = day_start;
    }

    public Date getDay_end() {
        return day_end;
    }

    public void setDay_end(Date day_end) {
        this.day_end = day_end;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
