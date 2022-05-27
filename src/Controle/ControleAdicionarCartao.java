package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import Visao.MercadoApp;

public class ControleAdicionarCartao {

    @FXML
    void adicionarButton(ActionEvent event) {

    }

    @FXML
    void adicionarImageButton(MouseEvent event) {

    }

    @FXML
    void voltarButton(ActionEvent event) {
      MercadoApp.changeScreenTelaDeCompras(event);
    }

    @FXML
    void voltarImageButton(MouseEvent event) {
      MercadoApp.changeScreenTelaLogin(event);
    }

}
