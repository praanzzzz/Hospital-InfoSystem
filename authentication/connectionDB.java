/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authentication;


import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author PC12
 */
public class connectionDB {

    public static Connection getConnectionDB() {
        Connection con;
        try {
            String host = "jdbc:mysql://localhost:3306/hpis";
            String username = "root";
            String password = "";
            con = (Connection) DriverManager.getConnection(host, username, password);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not connected!");
            e.printStackTrace();
            return null;
        }
        
    }

}
