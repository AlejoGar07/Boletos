package Tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tabla {
        private String Nombre;
	private String Responsable;
	private String Fecha;
	private String Horai;
	private String Horaf;
        private String Estado;
        
        public Tabla(){
	}
	public Tabla(String nombre, String responsable, String fecha, String horai, String horaf, String estado){
		this.Nombre = nombre;
		this.Responsable = responsable;
                this.Fecha=fecha;
		this.Horai = horai;
		this.Horaf = horaf;
		this.Estado = estado;
        }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHorai() {
        return Horai;
    }

    public void setHorai(String Horai) {
        this.Horai = Horai;
    }

    public String getHoraf() {
        return Horaf;
    }

    public void setHoraf(String Horaf) {
        this.Horaf = Horaf;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public ObservableList<Tabla> getTabla(){
	       ObservableList<Tabla> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Nombre, Responsable, Fecha, Horai, Horaf, Estado"
		       + " from Evento order by Codigo");
	       Connection con=null;
	       PreparedStatement  P=null;
	       ResultSet rs=null;
	       String url = "jdbc:postgresql://localhost:5432/Boletos";
	       String user = "postgres";
	       String password = "Ale0107";
	       
	        con = DriverManager.getConnection(url,user,password);
		P = con.prepareStatement(s);
	        rs=P.executeQuery();
	       
	       while (rs.next()){
		      String nombre=rs.getString("Nombre");
		      String resp=rs.getString("Responsable");
		      String fecha=rs.getString("Fecha");
		      String horai=rs.getString("Horai");
		      String horaf=rs.getString("Horaf");
                      String esta=rs.getString("Estado");
		      
		      Tabla t = new Tabla(nombre, resp, fecha, horai, horaf, esta);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}
}

