/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package proyecto.pkg2.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


/**
 *
 * @author HEWLETT PACKARD
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private TableColumn<?, ?> EstadoColumn;

    @FXML
    private TableColumn<?, ?> IDColumn;

    @FXML
    private TableColumn<?, ?> PrioridadColumn;

    @FXML
    private TableColumn<?, ?> TareaColumn;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Label label;

    @FXML
    private TableView<?> table;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtPrioridad;

    @FXML
    private TextField txtTarea;

    @FXML
    void Crear(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {

    }

    @FXML
    void Eliminar(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
