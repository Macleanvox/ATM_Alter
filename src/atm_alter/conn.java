/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_alter;

/**
 *
 * @author GOD
 */
import java.sql.*;

public class conn {
    Connection c;
    Statement s;

   public conn(){
       try{
           
                   
           Class.forName("com.mysql.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");
           System.out.println("Connected to Database");
           s=c.createStatement();
           
       
       }catch(Exception e){
           System.out.println(e);
       
       }
   
   }
   
}

