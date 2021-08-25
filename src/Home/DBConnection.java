package Home;

import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public static Connection getConnection() {
        Connection cc;
        
        String url = "jdbc:mysql://localhost:3306/lms";
        String user = "root";
        String pass = "root";
        
        Properties p = new Properties();
        p.setProperty("user", user);
        p.setProperty("password", pass);
        p.setProperty("useSSL", "false");
        p.setProperty("autoReconnect", "true");
        
        try {
            
            cc = DriverManager.getConnection(url, p);
            Class.forName("com.mysql.jdbc.Driver");
            return cc;
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
