package Conexiones;

import Tablas.Tabla;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Accionar {
    private String nombre;
    public Accionar() {
	}
	public Accionar(String Nombre){
		this.nombre = Nombre;
	}

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	@Override	
	public String toString(){
		return nombre;
	}
	public ObservableList<Accionar> getasiento(){
		ObservableList<Accionar> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/Boletos";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from Evento where Estado='"+"Activo"+"'");
	        Connection c = Postgres.getPostgres();
		PreparedStatement P = c.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
		      String nombre=rs.getString("Nombre");
		      
		      
		      Accionar co = new Accionar(nombre);
		      Cb.add(co);
	       }
	       
	       }catch(SQLException ex){
		     
	       }
	       return Cb;}
}
