package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import Visao.MercadoApp;

public class ControleCadastro {

    @FXML
    private GridPane anoTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextField diaTextField;

    @FXML
    private TextField diaTextField11;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField enderecoTextField;

    @FXML
    private TextField mesTextField;

    @FXML
    private TextField nomeTextFIeld;

    @FXML
    private TextField senhaTextField;

    @FXML
    void concluirButton(ActionEvent event) {
    
    }

    @FXML
    void concluirImageButton(MouseEvent event) {

    }

    @FXML
    void voltarButton(ActionEvent event) {
      MercadoApp.changeScreenTelaLogin(event);
    }

    @FXML
    void voltarImageButton(MouseEvent event) {
      MercadoApp.changeScreenTelaLogin(event);
    }

}
