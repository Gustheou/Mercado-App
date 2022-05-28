package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import Visao.MercadoApp;

public class ControleCadastro {

  @FXML
  private TextField cpfTextField;

  @FXML
  private TextField diaTextField;

  @FXML
  private TextField anoTextField;

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

  ControleCliente cC = new ControleCliente();

  @FXML
  void concluirButton(ActionEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
    try{
      String nome = nomeTextFIeld.getText();
      int diaDataNascimento = Integer.parseInt(diaTextField.getText());
      int mesDataNascimento = Integer.parseInt(mesTextField.getText());
      int anoDataNascimento = Integer.parseInt(anoTextField.getText());
      String endereco = enderecoTextField.getText();
      String cpf = cpfTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String dataDeNascimento = (String.valueOf(diaDataNascimento)+" / ");
      dataDeNascimento += (String.valueOf(mesDataNascimento)+" / ");
      dataDeNascimento += (String.valueOf(anoDataNascimento));
      if (nome.equals("") || diaDataNascimento == 0 || mesDataNascimento == 0 || anoDataNascimento == 0|| endereco.equals("") || cpf.equals("") || email.equals("") || senha.equals("")) {
        JOptionPane.showMessageDialog(null, "   Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
    } else {
        cC.cadastrarCliente(nome, dataDeNascimento, endereco, cpf,  email, senha);
        JOptionPane.showMessageDialog(null, "Cadastro do cliente efetuado com sucesso!");
        MercadoApp.changeScreenTelaLogin(event);
    }
    } catch (NumberFormatException e) {}
  }
  
  @FXML
  void concluirImageButton(MouseEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
    try{
      String nome = nomeTextFIeld.getText();
      int diaDataNascimento = Integer.parseInt(diaTextField.getText());
      int mesDataNascimento = Integer.parseInt(mesTextField.getText());
      int anoDataNascimento = Integer.parseInt(anoTextField.getText());
      String endereco = enderecoTextField.getText();
      String cpf = cpfTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String dataDeNascimento = (String.valueOf(diaDataNascimento)+" / ");
      dataDeNascimento += (String.valueOf(mesDataNascimento)+" / ");
      dataDeNascimento += (String.valueOf(anoDataNascimento));
      if (nome.equals("") || diaDataNascimento == 0 || mesDataNascimento == 0 || anoDataNascimento == 0|| endereco.equals("") || cpf.equals("") || email.equals("") || senha.equals("")) {
        JOptionPane.showMessageDialog(null, "   Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
    } else {
        cC.cadastrarCliente(nome, dataDeNascimento, endereco, cpf,  email, senha);
        JOptionPane.showMessageDialog(null, "Cadastro do cliente efetuado com sucesso!");
        MercadoApp.changeScreenTelaLogin(event);
    }
    } catch (NumberFormatException e) {}
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
