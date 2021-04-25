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
public class Login extends DB{
    
    
    public Login(String email, String password){
        
        try{
            String query="SELECT * FROM USER where EMAIL ='"+email+"' AND PASSWORD='"+password+"' ";
            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(0, email); 
//            pst.setString(1, password);
            ResultSet rs = pst.executeQuery();                        
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Login Successfull!");
           }           

           else{
               JOptionPane.showMessageDialog(null, "Invalid Email or Password");               
           }
        }catch(Exception ae){
            System.out.println(ae);
        }
           
    }
}
