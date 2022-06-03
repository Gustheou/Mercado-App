package Controle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

import Visao.MercadoApp;

public class ControleFinalizarCompra extends ControleMenuDeCompras{

  @FXML
  private Button adicionarButton;

  @FXML
  private MenuButton splitMenuButton;

  @FXML
  public TextArea textAreaCompras;

  @FXML
  private Button finalizarButton;

  @FXML
  private ImageView finalizarImageButton;

  private String setItem;
  private double troco = 0;
  String resultado;
  ControleMenuDeCompras cMC = new ControleMenuDeCompras();

  @FXML
  void refreshImageButton(MouseEvent event) {
    textAreaCompras.setText(compraTotal());
  }

  @FXML
  void aVistaMenuItem(ActionEvent event) {
    adicionarButton.setVisible(true);
    finalizarButton.setVisible(true);
    finalizarImageButton.setVisible(true);
    setItem = "À vista";
    splitMenuButton.setText(setItem);
    adicionarButton.setText("Troco?");
  }
  
  @FXML
  void cartaoMenuItem(ActionEvent event) {
    adicionarButton.setVisible(true);
    finalizarButton.setVisible(true);
    finalizarImageButton.setVisible(true);
    setItem = "Cartão";
    splitMenuButton.setText(setItem);
    adicionarButton.setText("Adicionar");
  }

  @FXML
  void adicionarButton(ActionEvent event) {
    if (setItem.equals("Cartão")){
      MercadoApp.changeScreenAdicionarCartao(event);
    } else {
      troco = Double.parseDouble(JOptionPane.showInputDialog(null, "A sua compra é de R$"+valorDaCompra+"\nGostaria de troco para quanto?"));
      while (troco < valorDaCompra ) {
        JOptionPane.showMessageDialog(null, "O valor a ser informado deve ser maior ou igual ao valor total da compra.");
        troco = Double.parseDouble(JOptionPane.showInputDialog(null, "A sua compra é de R$"+valorDaCompra+"\nGostaria de troco para quanto?"));
      }
      JOptionPane.showMessageDialog(null,"O seu troco será de: R$"+(troco - valorDaCompra)+"\nObrigado pela preferência, até a próxima.");
    }
  }

  @FXML
  void finalizarButton(ActionEvent event) {
    MercadoApp.changeScreenCompraFinalizada(event);
    setItem = "Pagamento";
    splitMenuButton.setText(setItem);
    adicionarButton.setVisible(false);
    textAreaCompras.setText("");
    finalizarButton.setVisible(false);
    finalizarImageButton.setVisible(false);
  }

  @FXML
  void voltarButton(ActionEvent event) {
    MercadoApp.changeScreenTelaDeCompras(event);
    setItem = "Pagamento";
    splitMenuButton.setText(setItem);
    adicionarButton.setVisible(false);
    textAreaCompras.setText("");
    finalizarButton.setVisible(false);
    finalizarImageButton.setVisible(false);
  }

  @FXML
  void voltarImageButton(MouseEvent event) {
    MercadoApp.changeScreenTelaDeCompras(event);
    setItem = "Pagamento";
    splitMenuButton.setText(setItem);
    adicionarButton.setVisible(false);
    textAreaCompras.setText("");
  }

 

}
