package Conexiones;


import Vistas.EscenarioController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Ingresar {
   int numeroC;
    public static void asignar(String evento, String asiento, String estado, String precio, String nombre, String apellido,
		String email, String cemail, int usertelefono, String pago){
	    
            String Evento=evento;
	    String Asiento=asiento;
	    String Estado=estado;
            String Precio=precio;
	    String Nombre=nombre;
	    String Apellido=apellido;
	    String Email=email;
            String Cemail=cemail;
	    int Telefono=usertelefono;
            String Pago=pago;
	    String query="INSERT INTO Boleto(Evento, Asiento, Estado, Precio, Nombre, Apellido, Email, Cemail, Telefono, Pago, Fecha) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = Postgres.getPostgres();
		PreparedStatement p = c.prepareStatement(query)){
		
                p.setString(1, Evento);
		p.setString(2, Asiento);
		p.setString(3, Estado);
                p.setString(4, Precio);
		p.setString(5, Nombre);
		p.setString(6, Apellido);
		p.setString(7, Email);
                p.setString(8, Cemail);
                p.setInt(9, Telefono);
                p.setString(10, Pago);
                p.setObject(11, LocalDateTime.now());
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Ingresar.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	}
   
    public static void asignar1(String evento, String asiento, String estado, String nombre, String apellido, String email, String cemail, int usertelefono, String pago){
            String Evento=evento;
            String Asiento=asiento;
	    String Estado=estado;
	    String Nombre=nombre;
	    String Apellido=apellido;
	    String Email=email;
            String Cemail=cemail;
	    int Telefono=usertelefono;
            String Pago=pago;
		ResultSet s=null;
		String query="UPDATE Boleto SET Evento=?, Estado=?, Nombre=?, Apellido=?, Email=?, Cemail=?, Telefono=?, Pago=? WHERE  Asiento=?";
		
		try{
                Connection c = Postgres.getPostgres();
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Evento);
                p.setString(2, Estado);
		p.setString(3, Nombre);
		p.setString(4, Apellido);
		p.setString(5, Email);
                p.setString(6, Cemail);
                p.setInt(7, Telefono);
                p.setString(8, Pago);
                p.setString(9, Asiento);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Ingresar.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
     public boolean Email (String Correo){
    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    Matcher mather = pattern.matcher(Correo);
    return mather.find();
	}
     
      public void setNumeroC(int numeroC) {
          
        if(numeroC > 9999 && numeroC < 100000){
        this.numeroC = numeroC;
        }else{
            System.out.println("Error");
        }
    }
     public int id1(){
	int id=1001;
	
	PreparedStatement p=null;
	ResultSet R=null;
	String sql="SELECT Codigo FROM Evento order by Codigo";
        
	try{
		Connection c = Postgres.getPostgres();
		p = c.prepareStatement(sql);
		R=p.executeQuery();
		while(R.next()){
			id=R.getInt(1) + 1;
		}
	}catch(Exception e){
		System.out.println("Error"+e.getMessage());
	}return id;
	}
     
    public static void evento(String nombre, String responsable, String fecha, String horai, String horaf, String estado, int id){
	    
            String Nombre=nombre;
            String Responsable=responsable;
	    String Fecha=fecha;
            String Horai=horai;
	    String Horaf=horaf;
            String Estado=estado;
            int Id=id;
	    String query="INSERT INTO Evento(Nombre, Responsable, Fecha, Horai, Horaf, Estado, Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = Postgres.getPostgres();
		PreparedStatement p = c.prepareStatement(query)){
		
                p.setString(1, Nombre);
                p.setString(2, Responsable);
		p.setString(3, Fecha);
                p.setString(4, Horai);
		p.setString(5, Horaf);
                p.setString(6, Estado);
                p.setInt(7, Id);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Ingresar.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
    }
    
    public int id(){
	int id=1001;
	
	PreparedStatement p=null;
	ResultSet R=null;
	String sql="SELECT Codigo FROM Usuarios order by Codigo";
        
	try{
		Connection c = Postgres.getPostgres();
		p = c.prepareStatement(sql);
		R=p.executeQuery();
		while(R.next()){
			id=R.getInt(1) + 1;
		}
	}catch(Exception e){
		System.out.println("Error"+e.getMessage());
	}return id;
	}
    
    public static void usuario(int codigo, String nombre, String apellido, String contra, String tipo, String email, String cemail, int telefono, String estado ){
	    int Codigo=codigo;
            String Nombre=nombre;
            String Apellido=apellido;
	    String Contra=contra;
            String Tipo=tipo;
	    String Email=email;
            String Cemail=cemail;
            int Telefono=telefono;
            String Estado=estado;
	    String query="INSERT INTO Usuarios(Codigo, Nombre, Apellido, Contra, Tipo, Email, Cemail, Telefono, Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = Postgres.getPostgres();
		PreparedStatement p = c.prepareStatement(query)){
		
                p.setInt(1, Codigo);
                p.setString(2, Nombre);
		p.setString(3, Apellido);
		p.setString(4, Contra);
                p.setString(5, Tipo);
		p.setString(6, Email);
                p.setString(7, Cemail);
                p.setInt(8, Telefono);
                p.setString(9, Estado);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Ingresar.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
    }
    public int existeOrga(String Email){
	PreparedStatement P=null;
	ResultSet rs=null;
	String sql = "SELECT count(Codigo) FROM Usuarios WHERE Email = ?";
	
		try{
		Connection c = Postgres.getPostgres();
		P = c.prepareStatement(sql);
		P.setString(1, Email);
		rs = P.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
			return 1001;
		}catch(SQLException ex){
			Logger.getLogger(Ingresar.class.getName()).log(Level.SEVERE, null, ex);
			return 1001;
	}	
	}
    public int existe(String Email){
	PreparedStatement P=null;
	ResultSet rs=null;
	String sql = "SELECT count(Codigo) FROM Usuarios WHERE Email = ?";
	
		try{
		Connection c = Postgres.getPostgres();
		P = c.prepareStatement(sql);
		P.setString(1, Email);
		rs = P.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
			return 1001;
		}catch(SQLException ex){
			Logger.getLogger(Ingresar.class.getName()).log(Level.SEVERE, null, ex);
			return 1001;
	}	
	}
}
