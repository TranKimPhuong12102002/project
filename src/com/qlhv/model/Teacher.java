/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.model;

import java.io.Serializable;

public class Teacher implements Serializable{
private String name;
    private String teacherID;
    private String gender;
    private String dob;
    private String department;
    private String address;
    private String phoneNumber;
    private String religion;
    private String email;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEmail() {
        return email;
    }
    public Teacher() {
    }

    public Teacher(String name, String teacherID, String gender, String department,String dob, String address, String phoneNumber, String religion) {
        this.name = name;
        this.teacherID = teacherID;
        this.gender = gender;
        this.department=department;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.religion = religion;
        this.email = this.name + "_"+this.department+"@vnu.edu.vn";
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n" + "studentId: "+teacherID+"\n" +"Gender: "+gender+"\n"+"Department"+department+"/n"+ "Address: "+address+"\n"+ "PhoneNumber: "+phoneNumber+"\n"
                +"Religion: "+religion+"\n"+"Email: "+email+"\n" ;
    }
}
