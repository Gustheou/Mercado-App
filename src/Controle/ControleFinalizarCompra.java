package Controle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import Visao.MercadoApp;

public class ControleFinalizarCompra {

    @FXML
    void adicionarButton(ActionEvent event) {
      MercadoApp.changeScreenAdicionarCartao(event);
    }

    @FXML
    void finalizarButton(ActionEvent event) {
      
    }

    @FXML
    void voltarButton(ActionEvent event) {
      MercadoApp.changeScreenTelaDeCompras(event);
    }

    @FXML
    void voltarImageButton(MouseEvent event) {
      MercadoApp.changeScreenTelaDeCompras(event);
    }

}
