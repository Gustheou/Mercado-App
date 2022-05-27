package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

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

    @FXML
    void concluirButton(ActionEvent event) {
      try {
        String nome = nomeTextFIeld.getText();
        String cpf = cpfTextField.getText();
        String endereco = enderecoTextField.getText();
        String email = emailTextField.getText();
        String senha = senhaTextField.getText();
        int dia = Integer.parseInt(diaTextField.getText());
        int mes = Integer.parseInt(mesTextField.getText());
        int ano = Integer.parseInt(anoTextField.getText());
        if (nome.equals("") || dia == 0 || mes == 0 || ano == 0 || cpf.equals("") || endereco.equals("") || email.equals("") || senha.equals("")) {
          JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
        } else {
          JOptionPane.showMessageDialog(null, "Cadastro do cliente efetuado com sucesso!");
          MercadoApp.changeScreenTelaDeCompras(event);
          //A partir dessa linha, será escrita no arquivo.
          String dataDeNascimento = (String.valueOf(dia)+" / ");
          dataDeNascimento += (String.valueOf(mes)+" / ");
          dataDeNascimento += (String.valueOf(ano));  
        }
      }catch (NumberFormatException i) {
        diaTextField.setText("Dia:");
        diaTextField.selectAll();
        diaTextField.requestFocus();

        mesTextField.setText("Mês:");
        mesTextField.selectAll();
        mesTextField.requestFocus();

        anoTextField.setText("Ano:");
        anoTextField.selectAll();
        anoTextField.requestFocus();
      }
    }


    @FXML
    void concluirImageButton(MouseEvent event) {
      try {
        String nome = nomeTextFIeld.getText();
        String cpf = cpfTextField.getText();
        String endereco = enderecoTextField.getText();
        String email = emailTextField.getText();
        int dia = Integer.parseInt(diaTextField.getText());
        int mes = Integer.parseInt(mesTextField.getText());
        int ano = Integer.parseInt(anoTextField.getText());
        if (nome.equals("") || dia == 0 || mes == 0 || ano == 0 || cpf.equals("") || endereco.equals("") || email.equals("")) {
          JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
        } else {
          JOptionPane.showMessageDialog(null, "Cadastro do cliente efetuado com sucesso!");
          MercadoApp.changeScreenTelaDeCompras(event);
          //A partir dessa linha, será escrita no arquivo.
          String dataDeNascimento = (String.valueOf(dia)+" / ");
          dataDeNascimento += (String.valueOf(mes)+" / ");
          dataDeNascimento += (String.valueOf(ano));  
        }
      }catch (NumberFormatException i) {
        diaTextField.setText("Dia:");
        diaTextField.selectAll();
        diaTextField.requestFocus();

        mesTextField.setText("Mês:");
        mesTextField.selectAll();
        mesTextField.requestFocus();

        anoTextField.setText("Ano:");
        anoTextField.selectAll();
        anoTextField.requestFocus();
      }
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
