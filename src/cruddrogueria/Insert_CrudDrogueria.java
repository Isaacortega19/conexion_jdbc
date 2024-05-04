
package cruddrogueria;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_CrudDrogueria {
    
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
            statement.executeUpdate("INSERT INTO PERSONA(cedula,nombre,direccion,telefono,email,rol) VALUES (1066763358,'Juan David','zipaquira','3008749789','juanmont@gmail.com','cliente')");
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
