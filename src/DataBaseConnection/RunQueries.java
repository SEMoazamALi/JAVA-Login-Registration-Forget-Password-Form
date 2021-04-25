/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author moaza
 */
public class RunQueries extends DB {
    
    
    private static String query;
    public void Insert(String name, String email, String password){
        try{
            query="INSERT INTO USER (NAME, EMAIL, PASSWORD) VALUES ( '"+name+"', '"+email+"', '"+password+"' )  ";
            stmt.executeUpdate(query);  
            JOptionPane.showMessageDialog(null, "Data Enter Successfully");  
            con.close(); 
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
    
    public void Del(){
        try{
            
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
    
    public void Update(){
        try{
            
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
    
}
