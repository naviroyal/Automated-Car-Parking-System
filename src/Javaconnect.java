
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navdeep
 */
public class Javaconnect {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
           Connection conn;
            conn = DriverManager.getConnection("jdbc:sqlite://home//navdeep//NetBeansProjects//Automated Car Parking System//asps.sqlite");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
