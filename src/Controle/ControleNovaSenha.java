package Controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Visao.MercadoApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControleNovaSenha {

  @FXML
  private Button finalizarNewSenha_Button;
  @FXML
  private Button prosseguirButton;
  @FXML
  private Button proseguirButton;
  @FXML
  private Button concluirButton;

  @FXML
  private TextField novaSenhaCPFTextField;
  @FXML
  private TextField novaSenhaUsuarioTextField;
  @FXML
  private AnchorPane posProseguirSenha;

  @FXML
  private ImageView imageConcluirButton;

  @FXML
  private VBox vboxDados;
  @FXML
  private VBox vboxNewSenha;

  @FXML
  private PasswordField confirmarNovaSenhaPasswordField;
  @FXML
  private PasswordField novaSenhaPasswordField;

  private String nomeUsuario, cpfUsuario;
  private Cliente cliente = new Cliente();
  @FXML
  public void voltarButton(ActionEvent event) {
    vboxNewSenha.setVisible(false);
    novaSenhaPasswordField.setText("");
    confirmarNovaSenhaPasswordField.setText("");
    novaSenhaCPFTextField.setText("");
    novaSenhaUsuarioTextField.setText("");
    vboxDados.setVisible(true);
    MercadoApp.changeScreenTelaLogin(event);
  }

  @FXML
  public void voltarImageButton(MouseEvent event) {
    MercadoApp.changeScreenTelaLogin(event);
  }

  @FXML
  public void concluirButton (ActionEvent event) {
    try {
      criarNovaSenha(event);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    vboxNewSenha.setVisible(false);
    novaSenhaPasswordField.setText("");
    confirmarNovaSenhaPasswordField.setText("");
    novaSenhaCPFTextField.setText("");
    novaSenhaUsuarioTextField.setText("");
    vboxDados.setVisible(true);
    MercadoApp.changeScreenTelaLogin(event);
  }

  @FXML
  public void concluirImageButton (ActionEvent event) {
    try {
      criarNovaSenha(event);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    vboxNewSenha.setVisible(false);
    novaSenhaPasswordField.setText("");
    confirmarNovaSenhaPasswordField.setText("");
    novaSenhaCPFTextField.setText("");
    novaSenhaUsuarioTextField.setText("");
    vboxDados.setVisible(true);
    MercadoApp.changeScreenTelaLogin(event);
  }

  @FXML
  public void prosseguirButton(ActionEvent event) {
    nomeUsuario = novaSenhaUsuarioTextField.getText();
    cpfUsuario = novaSenhaCPFTextField.getText();
    vboxDados.setVisible(false);
    vboxNewSenha.setVisible(true);
    concluirButton.setVisible(true);
    imageConcluirButton.setVisible(true);
  }

  @FXML
  public void criarNovaSenha(ActionEvent event) throws FileNotFoundException, ClassNotFoundException, IOException{
    if(novaSenhaPasswordField.getText().equals(confirmarNovaSenhaPasswordField.getText())){
      cliente.substituir(cpfUsuario, nomeUsuario, novaSenhaPasswordField.getText());
      JOptionPane.showMessageDialog(null,"Nova senha cadastrada com sucesso.");  
    }
  }
}//end class
