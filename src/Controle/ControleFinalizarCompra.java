package Controle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Visao.MercadoApp;

public class ControleFinalizarCompra implements Initializable {

  @FXML
  private Button adicionarButton;

  @FXML
  private MenuButton splitMenuButton;

  @FXML
  private TextArea TextAreaCompras;

  private String setItem;
  private double troco = 0;
  private double valorTotalDaCompra = 0;
  ControleMenuDeCompras cMC = new ControleMenuDeCompras();

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    TextAreaCompras.setText(String.valueOf(cMC.compraTotal())); 
  }

  @FXML
  void aVistaMenuItem(ActionEvent event) {
    adicionarButton.setVisible(true);
    setItem = "À vista";
    splitMenuButton.setText(setItem);
    adicionarButton.setText("Troco?");
  }
  
  @FXML
  void cartaoMenuItem(ActionEvent event) {
    adicionarButton.setVisible(true);
    setItem = "Cartão";
    splitMenuButton.setText(setItem);
    adicionarButton.setText("Adicionar");
  }

  @FXML
  void adicionarButton(ActionEvent event) {
    if (setItem.equals("Cartão")){
      MercadoApp.changeScreenAdicionarCartao(event);
    } else {
      troco = Double.parseDouble(JOptionPane.showInputDialog(null, "A sua compra é de R$ x\nGostaria de troco para quanto?"));
      while (troco < valorTotalDaCompra ) {
        JOptionPane.showMessageDialog(null, "O valor a ser informado deve ser maior ou igual ao valor total da compra.");
        troco = Double.parseDouble(JOptionPane.showInputDialog(null, "A sua compra é de R$ x\nGostaria de troco para quanto?"));
      }
    }
  }

  @FXML
  void finalizarButton(ActionEvent event) {
    
  }

  @FXML
  void voltarButton(ActionEvent event) {
    MercadoApp.changeScreenTelaDeCompras(event);
    setItem = "Pagamento";
    splitMenuButton.setText(setItem);
    adicionarButton.setVisible(false);
  }

  @FXML
  void voltarImageButton(MouseEvent event) {
    MercadoApp.changeScreenTelaDeCompras(event);
    setItem = "Pagamento";
    splitMenuButton.setText(setItem);
    adicionarButton.setVisible(false);
  }

 

}
