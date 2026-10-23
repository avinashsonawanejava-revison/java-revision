/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenprojectrevision;

import java.sql.*;
/**
 *
 * @author Administrator
 */
public class MavenprojectRevision {

    public static void main(String[] args) throws Exception{
 
     //Class.forName("org.postgresql.Driver");
     String url = "jdbc:postgresql://localhost:5432/demo";
     String user = "postgres";
     String password = "admin123";
     String query = "Select *  from student ";
    
     Connection con = DriverManager.getConnection(url,user,password);
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(query);
     
     while(rs.next()){
         System.out.print( rs.getInt("sid") + " ");
         System.out.print( rs.getString("sname") + " ");
         System.out.print( rs.getInt("marks"));
         System.out.println("");
     }
     
     
    }
}
