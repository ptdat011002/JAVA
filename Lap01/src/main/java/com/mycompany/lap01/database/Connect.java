/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap01.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Anh Tuan
 */
public class Connect {
    private String svName = "localhost";
    private int port = 1433;
    private String dbName = "QLSanpham";
    private String userID = "sa";
    private String password = "tridat";
    
    public Connection getConnection(){
        
        Connection conn = null;
        
        try {
            //Tạo kết nối database lưu vào conn;
            //B1: Nạp Driver cho java;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        
            String dbUrl = "jdbc:sqlserver://" + svName + ":" + port + ";databaseName=" + dbName
                    + ";encrypt=false;";
            conn = DriverManager.getConnection(dbUrl, userID, password);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage());
        }       
        
        return conn;
    }
}
