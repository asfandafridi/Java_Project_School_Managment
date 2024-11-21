/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_management_system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ConnectDB {
    Statement statement;
    Connection con;
    ConnectDB() {
    try{                
        Class.forName("com.mysql.cj.jdbc.Driver");  
        con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/student_management_system","root","root");  
       
        statement= con.createStatement();
        
    }catch(Exception e)
    { 
        JOptionPane.showMessageDialog(null, "connected successfully!");
        e.printStackTrace();
        
    }
    }  
}

