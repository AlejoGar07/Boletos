package Tablas;

import Conexiones.Postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tablas {
    private String Evento;
    private String Asiento;
    private String Estado;
    private String Precio;
    private String Nombre;
    private String Apellido;
    private String Email;
    private int Telefono;
    
    public Tablas(){
	}
	public Tablas(String evento, String asiento, String estado, String precio, String nombre, String apellido, String email, int telefono){
            this.Evento = evento;
            this.Asiento = asiento;
            this.Estado = estado;
            this.Precio = precio;
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Email = email;
            this.Telefono = telefono;
        }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String Asiento) {
        this.Asiento = Asiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
        
    public ObservableList<Tablas> getTablas(){
	       ObservableList<Tablas> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Evento, Asiento, Estado, Precio, Nombre, Apellido, Email, Telefono"
		       + " from Boleto order by Asiento");
	       PreparedStatement  P=null;
	       ResultSet rs=null;
	       
	        Connection c = Postgres.getPostgres();
		P = c.prepareStatement(s);
	        rs=P.executeQuery();
	       
	       while (rs.next()){
		      String evento=rs.getString("Evento");
		      String asiento=rs.getString("Asiento");
		      String estado=rs.getString("Estado");
		      String precio=rs.getString("Precio");
		      String nombre=rs.getString("Nombre");
                      String apellido=rs.getString("Apellido");
                      String email=rs.getString("Email");
                      int telefono=rs.getInt("Telefono");
		      
		      Tablas t = new Tablas(evento, asiento, estado, precio, nombre, apellido, email, telefono);
                      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}    
}
