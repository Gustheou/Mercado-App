package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

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

    ControleCliente cC = new ControleCliente();
    @FXML
    void prosseguirButton(MouseEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
      String login = String.valueOf(loginTextField.getText());
      String senha = String.valueOf(senhaTextField.getText());
      boolean loginMenu = false;
      boolean senhaMenu = false;
      try {
        loginMenu = cC.pesquisarLoginMenu(login);
        senhaMenu = cC.pesquisarSenhaMenu(senha);
      } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
      if (loginMenu == true && senhaMenu == true) {
        MercadoApp.changeScreenTelaDeCompras(event);
      } else {
        JOptionPane.showMessageDialog(null,"Login ou senha incorretos, tente novamente!");
      }
      loginTextField.setText("");
      senhaTextField.setText("");
    }

    @FXML
    void prosseguirImageButton(MouseEvent event) {
      String login = String.valueOf(loginTextField.getText());
      String senha = String.valueOf(senhaTextField.getText());
      boolean loginMenu = false;
      boolean senhaMenu = false;
      try {
        loginMenu = cC.pesquisarLoginMenu(login);
        senhaMenu = cC.pesquisarSenhaMenu(senha);
      } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }

      if (loginMenu == true && senhaMenu == true) {
        MercadoApp.changeScreenTelaDeCompras(event);
      } else {
        JOptionPane.showMessageDialog(null,"Login ou senha incorretos, tente novamente!");
      }
      loginTextField.setText("");
      senhaTextField.setText("");
    }

}
