package Vistas;

import Tablas.Tabla;
import Tablas.Tablas;
import Tablas.Tablass;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TablasController implements Initializable {

    @FXML
    private TableView<Tabla> Tabla;
    @FXML
    private TableColumn<Tabla, String> orga;
    @FXML
    private TableColumn<Tabla, String> direc;
    @FXML
    private TableColumn<Tabla, String> tel;
    @FXML
    private TableColumn<Tabla, String> corr;
    @FXML
    private TableColumn<Tabla, String> esta;
    @FXML
    private TableColumn<Tabla, String> fecha;
    @FXML
    private TableView<Tablas> Tabla1;
    @FXML
    private TableColumn<Tablas, String> orga1;
    @FXML
    private TableColumn<Tablas, String> direc1;
    @FXML
    private TableColumn<Tablas, String> tel1;
    @FXML
    private TableColumn<Tablas, String> corr1;
    @FXML
    private TableColumn<Tablas, String> esta1;
    @FXML
    private TableColumn<Tablas, String> fecha1;
    @FXML
    private TableColumn<Tablas, String> email;
    @FXML
    private TableColumn<Tablas, Integer> telef;
    @FXML
    private TableView<Tablass> Tabla2;
    @FXML
    private TableColumn<Tablass, String> orga2;
    @FXML
    private TableColumn<Tablass, String> direc2;
    @FXML
    private TableColumn<Tablass, String> tel2;
    @FXML
    private TableColumn<Tablass, String> corr2;
    @FXML
    private TableColumn<Tablass, String> esta2;
    @FXML
    private TableColumn<Tablass, Integer> fecha2;
    @FXML
    private TableColumn<Tablass, String> tado;
    @FXML
    private Button re;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Tabla T= new Tabla();
      ObservableList<Tabla> items=T.getTabla();
      this.orga.setCellValueFactory(new PropertyValueFactory("nombre"));
      this.direc.setCellValueFactory(new PropertyValueFactory("responsable"));
      this.tel.setCellValueFactory(new PropertyValueFactory("fecha"));
      this.corr.setCellValueFactory(new PropertyValueFactory("horai"));
      this.esta.setCellValueFactory(new PropertyValueFactory("horaf"));
      this.fecha.setCellValueFactory(new PropertyValueFactory("estado"));
      Tablas t= new Tablas();
      ObservableList<Tablas> itemss=t.getTablas();
      this.orga1.setCellValueFactory(new PropertyValueFactory("evento"));
      this.direc1.setCellValueFactory(new PropertyValueFactory("asiento"));
      this.tel1.setCellValueFactory(new PropertyValueFactory("estado"));
      this.corr1.setCellValueFactory(new PropertyValueFactory("precio"));
      this.esta1.setCellValueFactory(new PropertyValueFactory("nombre"));
      this.fecha1.setCellValueFactory(new PropertyValueFactory("apellido"));
      this.email.setCellValueFactory(new PropertyValueFactory("email"));
      this.telef.setCellValueFactory(new PropertyValueFactory("telefono"));
      Tablass TT= new Tablass();
      ObservableList<Tablass> itemsss=TT.getTablass();
      this.orga2.setCellValueFactory(new PropertyValueFactory("nombre"));
      this.direc2.setCellValueFactory(new PropertyValueFactory("apellido"));
      this.tel2.setCellValueFactory(new PropertyValueFactory("contra"));
      this.corr2.setCellValueFactory(new PropertyValueFactory("tipo"));
      this.esta2.setCellValueFactory(new PropertyValueFactory("email"));
      this.fecha2.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.tado.setCellValueFactory(new PropertyValueFactory("estado"));
      this.Tabla.setItems(items);
      this.Tabla1.setItems(itemss);
      this.Tabla2.setItems(itemsss);
    }    

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.re.getScene().getWindow();
	stage.close();}
    
}
