/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author faizan iqbal khanday
 */
public class DbConnect {
     public static Connection c;
    public static Statement st1;
    static {
    try{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/remittance"+"?useSSL=false",
                    "root","Phaixann@121");
        st1=c.createStatement();
        
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}
    
}
