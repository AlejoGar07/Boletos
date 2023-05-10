package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Postgres {
    private final String Host="localhost";
    private final String Puerto="5432";
    private final String DB="boletos";
    private final String User="postgres";
    private final String Password="Ale0107";
    
    public Connection getPostgres(){
        Connection postgres=null;
        
        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://"+Host+":"+Puerto+"/"+DB;
            postgres=DriverManager.getConnection(url,User,Password);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Error"));
        }
        return postgres;
    }
}
