package boletos;

import Conexiones.Postgres;
import Conexiones.Azure;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Boletos extends Application {
    
    @Override
    public void start(Stage primaryStage) throws SQLException {
        Postgres postgres=new Postgres();
        postgres.getPostgres();
        try{
        FXMLLoader cargar= new FXMLLoader();
        cargar.setLocation(Boletos.class.getResource("/Vistas/Menu.fxml"));
        Pane menu = (Pane) cargar.load();
        Scene s = new Scene (menu);
        primaryStage.setScene(s);
        primaryStage.show();
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
