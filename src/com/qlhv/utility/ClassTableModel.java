/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.utility;
import com.qlhv.model.Student;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClassTableModel {
    public DefaultTableModel setTableHocVien(List<Student> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 8 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        Student student = null;
        for (int i = 0; i < num; i++) {
            student = listItem.get(i);
            obj = new Object[columns];
            obj[0] = student.getStudentID();
            obj[1] = (i + 1);
            obj[2] = student.getName();
            obj[3] = student.getDob();
            obj[4] = student.getGender();
            obj[5] = student.getPhoneNumber();
            obj[6] = student.getAddress();
            obj[7] = student.getReligion();
            obj[8] = student.getGeneration();

            dtm.addRow(obj);
        }
        return dtm;
    }
}
