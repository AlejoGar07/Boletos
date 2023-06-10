package Vistas;



import Conexiones.Ingresar;
import boletos.Boletos;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class UsuariosController implements Initializable {

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
    private TextField Text5;
    @FXML
    private Button ag1;
    @FXML
    private Button cancel;
    @FXML
    private Button rg;
    @FXML
    private RadioButton adm;
    @FXML
    private RadioButton usu;
    @FXML
    private ToggleGroup tipo;
    
        boolean Admin=false;
        boolean User=false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void agregar1(ActionEvent event) {
        Ingresar conect= new Ingresar();
	    
     if(Text.getText().equals("") || Text1.getText().equals("") || Text2.getText().equals("") || Text3.getText().equals("")|| Text4.getText().equals("") || Text5.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
      String Adm="";
      String Usu="";
      String Nombre="";
      String Apellido="";
      String Contra="";
      String Tipo="";
      String Emaill="";
      String Cemail="";
      int Tel=0;
      int Id=conect.id();
      Nombre=Text.getText();
      Apellido=Text1.getText();
      Contra=Text2.getText();
      
      Emaill=Text3.getText();
      Cemail=Text4.getText();
      Tel=Integer.parseInt(Text5.getText());
      
      if(conect.existeOrga(Cemail)==0){
      if(conect.Email(Text3.getText())){
      if(Text4.getText().equals(Text4.getText())){
        if(adm.isSelected()){
		 Adm="Administrador";
                 Admin=true;
          }else{
                 Admin=false;
               }
          if(usu.isSelected()){
                 Usu="Usuario";
                 User=true;
          }else{
                 User=false;
               }
         
         if(Admin){ 
         Ingresar.usuario(Id, Nombre, Apellido, Contra, Adm, Cemail, Cemail, Tel, "Activo");
	 System.out.println(Text.getText());
	 System.out.println(Text1.getText());
	 System.out.println(Text2.getText());
         System.out.println(Adm);
	 System.out.println(Text3.getText());
         System.out.println(Text4.getText());
         System.out.println(Text5.getText());
         Alert a=new Alert(Alert.AlertType.INFORMATION);
	 a.setHeaderText(null);
	 a.setTitle("CORRECTO");
	 a.setContentText("Agregado");
	 a.showAndWait();
         Text.setText(""); Text1.setText(""); Text2.setText(""); Text3.setText(""); Text4.setText(""); Text5.setText(""); adm.setSelected(false); usu.setSelected(false); 
         }
         if(User){
         Ingresar.usuario(Id, Nombre, Apellido, Contra, Usu, Cemail, Cemail, Tel, "Activo");
	 System.out.println(Text.getText());
	 System.out.println(Text1.getText());
	 System.out.println(Text2.getText());
         System.out.println(Usu);
	 System.out.println(Text3.getText());
         System.out.println(Text4.getText());
         System.out.println(Text5.getText());
         Alert a=new Alert(Alert.AlertType.INFORMATION);
	 a.setHeaderText(null);
	 a.setTitle("CORRECTO");
	 a.setContentText("Agregado");
	 a.showAndWait();
         Text.setText(""); Text1.setText(""); Text2.setText(""); Text3.setText(""); Text4.setText(""); Text5.setText(""); adm.setSelected(false); usu.setSelected(false);
         }
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
        }}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Usuario ya Existe");
	   a.showAndWait();
	   }}
    }

    @FXML
    private void cancel(ActionEvent event) {
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
        adm.setSelected(false);
        usu.setSelected(false);
    }

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.rg.getScene().getWindow();
	stage.close();
    }
    
}
