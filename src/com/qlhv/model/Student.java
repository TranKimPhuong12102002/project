/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.model;

import java.io.Serializable;
import java.util.Date;


public class Student implements Serializable{
    private String name;
    private String studentID;
    private String generation;
    private String gender;
    private String dob;
    private String address;
    private String phoneNumber;
    private String religion;
    private String email;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    
    

    public String getDepartment() {
        return generation;
    }

    public void setDepartment(String department) {
        this.generation = department;
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

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
    
    public Student() {
    }

    public Student(String name, String studentID, String generation, String gender, String dob, String address, String phoneNumber, String religion) {
        this.name = name;
        this.studentID = studentID;
        this.generation = generation;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.religion = religion;
        this.email= this.name+"_"+this.generation+"@"+"hus.edu.vn";
    }

    

    @Override
    public String toString() {
       return "Name: "+name+"\n" + "studentId: "+studentID+"\n" +"Gender: "+gender+"\n"+ "Address: "+address+"\n"+ "PhoneNumber: "+phoneNumber+"\n"
                +"Religion: "+religion+"\n"+"Email: "+email+"\n" ;
    }
    
    
  
    
}
