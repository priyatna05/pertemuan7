/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author priya
 */       
    public class koneksi {
            static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
            static final String url = "jdbc:mysql://localhost:3306/pertemuan6";
            static final String user = "root";
            static final String pass = "";
            static Connection conn;
            static Statement stat;
            static ResultSet rs;
            
    public static Connection connectDatabse(){
        try{
            Class.forName(jdbc_driver);
            }catch(ClassNotFoundException conf){
                
        }try{
         conn = DriverManager.getConnection(url, user, pass);
         JOptionPane.showMessageDialog(null, "Koneksi database berhasil");
        }       catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Koneksi database gagal");
        }
        return conn;
    }
    }