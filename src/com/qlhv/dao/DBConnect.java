/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection getConnection() {
        Connection cons = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cons = DriverManager.getConnection("jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=Education", "sa", "12102002");
        } catch (Exception e) {
             e.printStackTrace();
        }
        return cons;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}
    
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
//        Connection cons =DriverManager.getConnection(url, userID, password);
//        System.out.println(getConnection());
//        return cons;

//private final String serverName = "ADMIN\\SQLEXPRESS";
//    private final String dbName = "Education";
//    private final String portNumber = "1433";
//    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
//    private final String userID = "sa";
//    private final String password = "12102002";
