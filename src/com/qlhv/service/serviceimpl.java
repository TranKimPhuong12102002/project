/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.service;

import com.qlhv.dao.Studentdao;
import com.qlhv.dao.Studentdaoimpl;
import com.qlhv.model.Student;
import java.util.List;
public class serviceimpl implements service{

    private Studentdao studentdao = null;

    public serviceimpl() {
        this.studentdao = new Studentdaoimpl();
    }
    @Override
    public List<Student> getList() {
        return studentdao.getlist();
    }
    
}
