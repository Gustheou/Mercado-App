package Controle;

import Visao.MercadoApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class ControleNovaSenha {

    @FXML
    private Button finalizarNewSenha_Button;

    @FXML
    private Button prosseguirButton;

    @FXML
    private TextField novaSenhaCPFTextField;

    @FXML
    private TextField novaSenhaUsuarioTextField;

    @FXML
    private AnchorPane posProseguirSenha;

    @FXML
    private Button proseguirButton;

    @FXML
    private Button concluirButton;

    @FXML
    private ImageView imageConcluirButton;

    @FXML
    private VBox userCPF_Vboc;

    @FXML
    void voltarButton(ActionEvent event) {
      MercadoApp.changeScreenTelaLogin(event);
    }

    @FXML
    void voltarImageButton(MouseEvent event) {
      MercadoApp.changeScreenTelaLogin(event);
    }

    @FXML
    void prosseguirButton(ActionEvent event) {
      //pesquisar nos arquivos
      novaSenhaCPFTextField.setVisible(false);
      novaSenhaUsuarioTextField.setVisible(false);
      prosseguirButton.setVisible(false);

    }

}
