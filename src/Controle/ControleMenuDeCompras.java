package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import Visao.MercadoApp;

public class ControleMenuDeCompras {

    @FXML
    void finalizarCompraButton(ActionEvent event) {
      MercadoApp.changeScreenFinalizarCompra(event);
    }

    @FXML
    void finalizarCompraImageButton(MouseEvent event) {
      MercadoApp.changeScreenFinalizarCompra(event);
    }

}
