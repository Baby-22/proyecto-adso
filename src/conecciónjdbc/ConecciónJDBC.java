// JHOAN DAVID SUAZA ANALSIS Y DESARROLLO DE SOTFWARE FICHA 2758372
package conecciónjdbc;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConecciónJDBC { 
    public static void main(String[] args) {
            String usuario = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/adso";
            Connection conexion;
            Statement statement;
            ResultSet rs;
            
            try {
                conexion = DriverManager.getConnection(url,usuario,password);
           
                //Consulta de datos           
                statement = conexion.createStatement();
                rs = statement.executeQuery("SELECT * FROM clientes");           
                while (rs.next()) {
                System.out.println(rs.getString("nombre"));      
                }
          
                //Inserción de datos            
                statement.execute("INSERT INTO ´clientes´(´edad´, ´nombre´) VALUES (´24´,´CARLOS´)");           
                System.out.println("");           
                rs = statement.executeQuery("SELECT * FROM clientes");           
                while (rs.next()){
                System.out.println(rs.getString("nombre")+" "+rs.getInt("edad"));
                
           
                }
           
                //Actualizacion de datos 
                statement.execute("UPDATE ´CLIENTES´SET ´NOMBRE´ = ´pedro´ , ´edad´ = ´23´ WHERE ´cliente´.´idclientes´=2;");
                System.out.println("");           
                rs = statement.executeQuery("SELET + FROM clinete");           
                while (rs.next()) {
                    System.out.println(rs.getString("nombre")+" "+rs.getInt("edad"));
                 
                    }  
                //eliminacion de datos
                statement.execute("DELETE FROM `clientes` WHERE ´idclientes´=7");
                System.out.println("");           
                rs = statement.executeQuery("SELET + FROM clinete");           
                while (rs.next()) {
                    System.out.println(rs.getString("nombre")+" "+rs.getInt("edad"));
                 
                    }
  
         
 
            }

            catch (SQLException ex) {
            Logger.getLogger(ConecciónJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
        
    }
}   
   
