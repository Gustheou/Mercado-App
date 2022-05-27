package Visao;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MercadoApp extends Application{
  private static Stage stage;
  private static Scene telaLogin;
  private static Scene telaCadastro;
  private static Scene telaEsqueceuSenha;
  private static Scene telaDeCompras;
  private static Scene telaDeFinalizarCompra;
  private static Scene telaDeAdicionarCartao;

  public static void main (String [] args) {
    launch (args);
  }

  @Override
  public void start (Stage cenario) throws IOException {
    stage = cenario;
    cenario.setTitle("MercadoApp");
    Parent fxmlTelaInicial = FXMLLoader.load(getClass().getResource("LoginScreenMercadoApp.fxml"));
    telaLogin = new Scene (fxmlTelaInicial);
    Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
    telaCadastro = new Scene (fxmlCadastro);
    Parent fxmlEsqueceuSenha = FXMLLoader.load(getClass().getResource("EsqueciSenha.fxml"));
    telaEsqueceuSenha = new Scene (fxmlEsqueceuSenha);
    Parent fxmlTelaDeCompras = FXMLLoader.load(getClass().getResource("MenuDeCompras.fxml"));
    telaDeCompras = new Scene (fxmlTelaDeCompras);
    Parent fxmlTelaDeFinalizarCompra = FXMLLoader.load(getClass().getResource("FinalizarCompra.fxml"));
    telaDeFinalizarCompra = new Scene (fxmlTelaDeFinalizarCompra);
    Parent fxmlTelaDeAdicionarCartao = FXMLLoader.load(getClass().getResource("AdicionarCartao.fxml"));
    telaDeAdicionarCartao = new Scene (fxmlTelaDeAdicionarCartao);


    cenario.getIcons().add(new Image("Imagens/Icone.png"));
    cenario.setScene(telaLogin);
    cenario.show();
  }//Fim do metodo start

  public static void changeScreenTelaLogin (MouseEvent event) {
    stage.setScene(telaLogin);
  }

  public static void changeScreenTelaLogin (ActionEvent event){
    stage.setScene(telaLogin);
  }
  
  public static void changeScreenCadastro (ActionEvent event) {
    stage.setScene(telaCadastro);
  }

  public static void changeScreenEsqueceuSenha (MouseEvent event) {
    stage.setScene(telaEsqueceuSenha);
  }

  public static void changeScreenTelaDeCompras (MouseEvent event){
    stage.setScene(telaDeCompras);
  }

  public static void changeScreenTelaDeCompras (ActionEvent event){
    stage.setScene(telaDeCompras);
  }

  public static void changeScreenFinalizarCompra (MouseEvent event){
    stage.setScene(telaDeFinalizarCompra);
  }

  public static void changeScreenFinalizarCompra (ActionEvent event){
    stage.setScene(telaDeFinalizarCompra);
  }

  public static void changeScreenAdicionarCartao (ActionEvent event){
    stage.setScene(telaDeAdicionarCartao);
  }
}//Fim da classe Principal