/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectdatafetch;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class MavenprojectDataFetch {

    public static void main(String[] args) throws Exception {
        
        String url="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "admin123";
        String sql = "insert into student values(4,'Sumit',85) ";
        Connection con =DriverManager.getConnection(url,user,password);
         
        Statement st = con.createStatement();
        boolean b = st.execute(sql);
        System.out.println(b);
    }
}
