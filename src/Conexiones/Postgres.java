package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Postgres {
    private static Connection conn;
    private static String url= "jdbc:postgresql://localhost:5432/Boletos";
    private static String User="postgres";
    private static String Password="Ale0107";
    
    public static Connection getPostgres() throws SQLException{
        
        try{
            Class.forName("org.postgresql.Driver");
            
            conn=DriverManager.getConnection(url,User,Password);
            System.out.println("Conexion Exitosa");
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());

        }
        return conn;
    }
    
}
