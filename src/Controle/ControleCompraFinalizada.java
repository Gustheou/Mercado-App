package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Visao.MercadoApp;

public class ControleCompraFinalizada {

  @FXML
  void retornarButton(ActionEvent event) {
    MercadoApp.changeScreenTelaLogin(event);
  }
}
