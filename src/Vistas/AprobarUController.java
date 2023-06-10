package Vistas;

import Conexiones.Accionar;
import Conexiones.Postgres;
import boletos.Boletos;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AprobarUController implements Initializable {

    @FXML
    private Button b;
    @FXML
    private TextField Usuario;
    @FXML
    private PasswordField Contra;
    @FXML
    private Button ingreso;
    @FXML
    private Button cancel;
    @FXML
    private ComboBox<Accionar> box;
    @FXML
    private TextField Text;
    
    public static String User=null;
    public static String Eve=null;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Accionar C=new Accionar();  
	ObservableList<Accionar> items=C.getasiento();
	this.box.setItems(items);
    }    

    @FXML
    private void Regresar(ActionEvent event) {
        Stage stage= (Stage) this.b.getScene().getWindow();
	stage.close();
    }

    @FXML
    private void Ingresar(ActionEvent event) {
        User=Usuario.getText();
        String Password=Contra.getText();
        
        if(User.equals("admin")&&Password.equals("admin")){
            System.out.println(User + Password);
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("CORRECTO");
                    a.setContentText("Ingreso Correcto");
                    a.showAndWait();
                    try{
			FXMLLoader cargar= new FXMLLoader();
			 cargar.setLocation(Boletos.class.getResource("/Vistas/Escenario.fxml"));
			 Parent root = cargar.load();
			 Scene scene = new Scene (root);
			 Stage stage= new Stage();
			 stage.setScene(scene);
			 stage.showAndWait();
                         stage.close();
                         Stage stagee= (Stage) this.b.getScene().getWindow();
                         stagee.close();
                    }catch(Exception e){
			e.printStackTrace();
		}
        }else{
            try{
                
                String s = ("select * from Usuarios where Tipo='"+"Usuario"+"' and Email=? and Contra=? and Estado='"+"Activo"+"'");
	        Connection c = Postgres.getPostgres();
		PreparedStatement P = c.prepareStatement(s);
                P.setString(1, User);
                P.setString(2, Password);
                ResultSet rs=P.executeQuery();
                if(rs.next()){
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("CORRECTO");
                    a.setContentText("Ingreso Correcto");
                    a.showAndWait();
                    try{
			FXMLLoader cargar= new FXMLLoader();
			 cargar.setLocation(Boletos.class.getResource("/Vistas/Escenario.fxml"));
			 Parent root = cargar.load();
			 Scene scene = new Scene (root);
			 Stage stage= new Stage();
			 stage.setScene(scene);
			 stage.showAndWait();
                         stage.close();
                         Stage stagee= (Stage) this.b.getScene().getWindow();
                         stagee.close();
                    }catch(Exception e){
			e.printStackTrace();
		}
                }else{
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("CORRECTO");
                    a.setContentText("Ingreso Incorrecto");
                    a.showAndWait();
                    Usuario.setText("");
                    Contra.setText("");
                }
            }catch(SQLException ex){
                Logger.getLogger(AprobarUController.class.getName()).log(Level.SEVERE, null, ex);
            }}}
    @FXML
    private void cancel(ActionEvent event) {
        Usuario.setText("");
        Contra.setText("");}

    @FXML
    private void evento(ActionEvent event) {
        Accionar c = this.box.getValue();
            if (c != null) {
                this.Text.setText(c.getNombre());
                Eve=Text.getText();
            }}
    
}
