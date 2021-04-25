/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnection;

import java.sql.*;


public abstract class DB {
    public Connection con;
    public Statement stmt;
    DB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/UI_UX?zeroDateTimeBehavior=CONVERT_TO_NULL";
             con=DriverManager.getConnection(url, "root", "");  
             stmt=con.createStatement();  
             
             System.out.println("Connect Successfull!");
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
}
