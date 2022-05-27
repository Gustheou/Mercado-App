package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import Visao.MercadoApp;

public class ControleTelaLogin {

    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField senhaTextField;

    @FXML
    void cadastrarButton(ActionEvent event) {
      MercadoApp.changeScreenCadastro(event);
    }

    @FXML
    void esqueceuSenhaButton(MouseEvent event) {
      MercadoApp.changeScreenEsqueceuSenha(event);
    }

    @FXML
    void prosseguirButton(MouseEvent event) {
      MercadoApp.changeScreenTelaDeCompras(event);
    }

    @FXML
    void prosseguirImageButton(MouseEvent event) {
      MercadoApp.changeScreenTelaDeCompras(event);
    }

}
