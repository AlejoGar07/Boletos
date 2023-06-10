package Vistas;

import Conexiones.Ingresar;
import boletos.Boletos;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EventoController implements Initializable {

    @FXML
    private TextField Text;
    @FXML
    private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private TextField Text3;
    @FXML
    private Button con;
    @FXML
    private Button re;
    @FXML
    private DatePicker fecha;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
      LocalDate fech= fecha.getValue();
      String Evento="";
      String Nombre="";
      String Horai="";
      String Horaf="";
      int Tel=0;
      Evento=Text.getText();
      Nombre=Text1.getText();
      Horai=Text2.getText();
      Horaf=Text3.getText();
      int Id=conect.id1();
	 System.out.println(Text.getText());
	 System.out.println(Text1.getText());
	 System.out.println(Text2.getText());
	 System.out.println(Text3.getText());
         Ingresar.evento(Evento, Nombre, fech.toString(), Horai, Horaf, "Activo",Id);
         Alert a=new Alert(Alert.AlertType.INFORMATION);
	 a.setHeaderText(null);
	 a.setTitle("CORRECTO");
	 a.setContentText("Agregado");
	 a.showAndWait();
        Text.setText(""); Text1.setText(""); Text2.setText(""); Text3.setText("");
	}
    }

    @FXML
    private void regresar(ActionEvent event) {
        Stage stagee= (Stage) this.re.getScene().getWindow();
        stagee.close();
    }
    
}
