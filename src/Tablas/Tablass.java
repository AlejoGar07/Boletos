package Tablas;

import Conexiones.Postgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tablass {
    private String Nombre;
    private String Apellido;
    private String Contra;
    private String Tipo;
    private String Email;
    private int Telefono;
    private String Estado;
    public Tablass(){
	}
	public Tablass(String nombre, String apellido, String contra, String tipo, String email, int telefono, String estado){
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Contra = contra;
            this.Tipo = tipo;
            this.Email = email;
            this.Telefono = telefono;
            this.Estado = estado;
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

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
        
    public ObservableList<Tablass> getTablass(){
	       ObservableList<Tablass> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Nombre, Apellido, Contra, Tipo, email, Telefono, Estado"
		       + " from usuarios order by Codigo");
	       PreparedStatement  P=null;
	       ResultSet rs=null;
	       
	        Connection c = Postgres.getPostgres();
		P = c.prepareStatement(s);
	        rs=P.executeQuery();
	       
	       while (rs.next()){
		      String nombre=rs.getString("Nombre");
		      String apellido=rs.getString("Apellido");
		      String contra=rs.getString("Contra");
		      String tipo=rs.getString("Tipo");
		      String email=rs.getString("Email");
                      int telefono=rs.getInt("Telefono");
                      String estado=rs.getString("Estado");
		      
		      Tablass t = new Tablass(nombre, apellido, contra, tipo, email, telefono, estado);
                      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}        
}

