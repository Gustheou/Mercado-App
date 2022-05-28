package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import Visao.MercadoApp;

public class ControleAdicionarCartao {
  @FXML
  private TextField titularTextField;

  @FXML
  private TextField numeroTextField;

  @FXML
  private TextField validadeMesTextField;

  @FXML
  private TextField validadeAnoTextField;

  @FXML
  private TextField cvvTextField;

  @FXML
  private TextField enderecoTextField;

  @FXML
  private TextField cidadeTextField;

  ControleCartao cc = new ControleCartao();


  @FXML
  void adicionarButton(ActionEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
    try{
      String nomeDoTitularDoCartao = titularTextField.getText();
      String numeroDoCartao = numeroTextField.getText();
      String mesDoVencimento = validadeMesTextField.getText();
      String anoDoVencimento = validadeAnoTextField.getText();
      String cvv = cvvTextField.getText();
      String endereco = enderecoTextField.getText();
      String cidade = cidadeTextField.getText();

      if (nomeDoTitularDoCartao.equals("") || numeroDoCartao.equals("") || mesDoVencimento.equals("") || anoDoVencimento.equals("") || cvv.equals("") || endereco.equals("") || cidade.equals("")) {
        JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
    } else {
        JOptionPane.showMessageDialog(null, "Cadastro do cartao efetuado com sucesso!");
        
        cc.cadastrarCartao(nomeDoTitularDoCartao, numeroDoCartao, mesDoVencimento, anoDoVencimento, cvv, endereco, cidade);
        MercadoApp.changeScreenFinalizarCompra(event);
    }
    } catch (NumberFormatException e) {}
  }

  @FXML
  void adicionarImageButton(MouseEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
    try{
      String nomeDoTitularDoCartao = titularTextField.getText();
      String numeroDoCartao = numeroTextField.getText();
      String mesDoVencimento = validadeMesTextField.getText();
      String anoDoVencimento = validadeAnoTextField.getText();
      String cvv = cvvTextField.getText();
      String endereco = enderecoTextField.getText();
      String cidade = cidadeTextField.getText();

      if (nomeDoTitularDoCartao.equals("") || numeroDoCartao.equals("") || mesDoVencimento.equals("") || anoDoVencimento.equals("") || cvv.equals("") || endereco.equals("") || cidade.equals("")) {
        JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
    } else {
        JOptionPane.showMessageDialog(null, "Cadastro do cartao efetuado com sucesso!");
        
        cc.cadastrarCartao(nomeDoTitularDoCartao, numeroDoCartao, mesDoVencimento, anoDoVencimento, cvv, endereco, cidade);
        MercadoApp.changeScreenFinalizarCompra(event);
    }
    } catch (NumberFormatException e) {}
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