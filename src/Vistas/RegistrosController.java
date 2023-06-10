package Vistas;

import Conexiones.Ingresar;
import Conexiones.Postgres;
import boletos.Boletos;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class RegistrosController implements Initializable {

    @FXML
    private TextField Text;
    @FXML
    private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private TextField Text3;
    @FXML
    private TextField Text4;
    @FXML
    private Button con;
    @FXML
    private Button re;
    @FXML
    private TextField t;
    @FXML
    private TextField t1;
    @FXML
    private Button asi;
    @FXML
    private Button auto;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private Button pago;

    EscenarioController bot = new EscenarioController();
    EscenarioController bot1 = new EscenarioController();
    AprobarUController eve = new AprobarUController();
    AprobarUController even = new AprobarUController();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        t.setText(bot.Nom);
        t1.setText(bot1.Bot);
        t2.setText(eve.Eve);
        t3.setText(even.User);
        
        if(Text4.getText().length() >= 8){}
    }    

    @FXML
    private void confirmar(ActionEvent event) {
         Ingresar conect= new Ingresar();
	    
     if(Text.getText().equals("") || Text1.getText().equals("") || Text2.getText().equals("") || Text3.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
      String Evento="";   
      String Asiento="";
      String Estado="";
      String Nombre="";
      String Apellido="";
      String Emaill="";
      String Cemail="";
      int Tel=0;
      Evento=t2.getText();
      Asiento=t.getText();
      Estado=t1.getText();
      Nombre=Text.getText();
      Apellido=Text1.getText();
      Emaill=Text2.getText();
      Cemail=Text3.getText();
      Tel=Integer.parseInt(Text4.getText());
      String Pago="Incompleto";
      if(conect.Email(Text2.getText())){
      if(Text2.getText().equals(Text3.getText())){
        
         System.out.println(t2.getText());
	 System.out.println(Text.getText());
	 System.out.println(Text1.getText());
	 System.out.println(Text2.getText());
	 System.out.println(Text3.getText());
         System.out.println(Text4.getText());
         Ingresar.asignar1(Evento,Asiento, Estado, Nombre, Apellido, Emaill, Cemail, Tel, Pago);
         Alert a=new Alert(Alert.AlertType.INFORMATION);
	 a.setHeaderText(null);
	 a.setTitle("CORRECTO");
	 a.setContentText("Agregado");
	 a.showAndWait();
        Text.setText(""); Text1.setText(""); Text2.setText(""); Text3.setText(""); Text4.setText(""); t.setText(""); t1.setText("");
	}else{
           Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo no Coincide");
	   a.showAndWait();    
            }
        }else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo es Invalido");
	   a.showAndWait();
           }}}
    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.re.getScene().getWindow();
	stage.close();
    }

    @FXML
    private void asignar(ActionEvent event) {
                try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(Boletos.class.getResource("/Vistas/Escenario.fxml"));
			Parent root = cargar.load();
                        Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
                        stage.close();
                        Stage stagee= (Stage) this.re.getScene().getWindow();
                        stagee.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
    }

    @FXML
    private void completar(ActionEvent event) {
        PreparedStatement P=null;
	ResultSet rs=null;
        String s = ("select * from Usuarios where Email='"+t3.getText()+"' and Estado='"+"Activo"+"'");
            try{
	        Connection c = Postgres.getPostgres();
		P = c.prepareStatement(s);
	        rs=P.executeQuery();
	       while (rs.next()) {
               this.Text.setText(rs.getString("Nombre"));
               this.Text1.setText(rs.getString("Apellido"));
               this.Text2.setText(rs.getString("Email"));
               this.Text3.setText(rs.getString("Cemail"));
               this.Text4.setText(rs.getString("Telefono"));
               }
	      }catch(SQLException ex){}
	      }

    @FXML
    private void pagar(ActionEvent event) {
        try{
		FXMLLoader cargar= new FXMLLoader();
		cargar.setLocation(Boletos.class.getResource("/Vistas/Pago.fxml"));
		Parent root = cargar.load();
                Scene scene = new Scene (root);
                Stage stage= new Stage();
                stage.setScene(scene);
		stage.showAndWait();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }
    
}
