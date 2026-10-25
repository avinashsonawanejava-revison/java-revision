/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class Mavenproject1 {

    public static void main(String[] args) throws Exception {
        
        int id =5;
        String name ="mukesh";
        int marks = 65;
        
        String url="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "admin123";
        String sql = "insert into student values(?,?,?) ";
 
        
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
         ps.setInt(3, marks);
        
        ps.execute();
        
    }
}
