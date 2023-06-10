package Vistas;



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
import javafx.stage.Stage;

public class MenuController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void crear(ActionEvent event) {
        try{
		FXMLLoader cargar= new FXMLLoader();
		cargar.setLocation(Boletos.class.getResource("/Vistas/Usuarios.fxml"));
		Parent root = cargar.load();
                Scene scene = new Scene (root);
                Stage stage= new Stage();
                stage.setScene(scene);
		stage.showAndWait();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }

    @FXML
    private void comprar(ActionEvent event) {
        try{
		FXMLLoader cargar= new FXMLLoader();
		cargar.setLocation(Boletos.class.getResource("/Vistas/AprobarU.fxml"));
		Parent root = cargar.load();
                Scene scene = new Scene (root);
                Stage stage= new Stage();
                stage.setScene(scene);
		stage.showAndWait();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }

    @FXML
    private void creare(ActionEvent event) {
        try{
		FXMLLoader cargar= new FXMLLoader();
		cargar.setLocation(Boletos.class.getResource("/Vistas/AprobarA.fxml"));
		Parent root = cargar.load();
                Scene scene = new Scene (root);
                Stage stage= new Stage();
                stage.setScene(scene);
		stage.showAndWait();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }

    @FXML
    private void reporte(ActionEvent event) {
         try{
		FXMLLoader cargar= new FXMLLoader();
		cargar.setLocation(Boletos.class.getResource("/Vistas/Tablas.fxml"));
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
