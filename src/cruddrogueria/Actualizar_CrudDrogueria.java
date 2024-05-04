
package cruddrogueria;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Actualizar_CrudDrogueria {

    
    public static void main(String[] args) {
        
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/drogueria";
        
        Connection conexion;
        Statement statement;
        ResultSet rs;
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Actualizar_CrudDrogueria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("update persona set nombre = 'Alonso Reyes' where cedula = 1066763358");
            rs = statement.executeQuery("SELECT * FROM PERSONA");
            rs.next();
            do {
                System.out.println(rs.getInt("cedula") + " : " + rs.getString("nombre"));
            } while (rs.next());
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar_CrudDrogueria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
