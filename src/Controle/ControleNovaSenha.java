package Controle;

import Visao.MercadoApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
      //Fazer condicional se as senhas sao iguais e depois salvar a nova senha
    }

    @FXML
    public void concluirImageButton (ActionEvent event) {
      //Fazer condicional se as senhas sao iguais e depois salvar a nova senha
    }

    @FXML
    public void prosseguirButton(ActionEvent event) {
      //pesquisar nos arquivos
      vboxDados.setVisible(false);
      vboxNewSenha.setVisible(true);
      concluirButton.setVisible(true);
      imageConcluirButton.setVisible(true);

    }
}