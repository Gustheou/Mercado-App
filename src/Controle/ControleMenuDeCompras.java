package Controle;

import Visao.MercadoApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ControleMenuDeCompras {

  @FXML
  private Label berinjelaQuantLabel;

  @FXML
  private Label cenouraQuantLabel;

  @FXML
  private Label frangoQuantLabel;

  @FXML
  private Label leiteQuantLabel;

  @FXML
  private Label ovosQuantLabel;

  @FXML
  private Label picanhaQuantLabel;

  @FXML
  private Label quantAlfaceLabel;

  @FXML
  private Label quantPaoLabel;

  @FXML
  private Label queijoQuantLabel;

  @FXML
  private Label tomateQuantLabel;

  public int contPao, contBerinjela, contOvos, contFrango, contLeite, contCenoura, contPicanha,
  contAlface, contQueijo, contTomate = 0;

  @FXML
  void adicionarAlfaceButton(ActionEvent event) {
    contAlface += 1;
    if(contAlface < 10)
    quantAlfaceLabel.setText('0' + String.valueOf(contAlface));
    else
    quantAlfaceLabel.setText(String.valueOf(contAlface));
    setContAlface(contAlface);
  }

  @FXML
  void adicionarBerinjelaButton(ActionEvent event) {
    contBerinjela += 1;
    if(contBerinjela < 10)
    berinjelaQuantLabel.setText('0' + String.valueOf(contBerinjela));
    else 
    berinjelaQuantLabel.setText(String.valueOf(contBerinjela));
    setContBerinjela(contBerinjela);
  }

  @FXML
  void adicionarCenouraButton(ActionEvent event) {
    contCenoura += 1;
    if(contCenoura < 10)
    cenouraQuantLabel.setText('0' + String.valueOf(contCenoura));
    else 
    cenouraQuantLabel.setText(String.valueOf(contCenoura));
    setContCenoura(contCenoura);
  }

  @FXML
  void adicionarFrangoButton(ActionEvent event) {
    contFrango += 1;
    if(contFrango < 10)
    frangoQuantLabel.setText('0' + String.valueOf(contFrango));
    else
    frangoQuantLabel.setText(String.valueOf(contFrango));
    setContFrango(contFrango);
  }

  @FXML
  void adicionarLeiteButton(ActionEvent event) {
    contLeite += 1;
    if(contLeite < 10)
    leiteQuantLabel.setText('0' + String.valueOf(contLeite));
    else
    leiteQuantLabel.setText(String.valueOf(contLeite));
    setContLeite(contLeite);
  }

  @FXML
  void adicionarOvosButton(ActionEvent event) {
    contOvos += 1;
    if(contOvos < 10)
    ovosQuantLabel.setText('0' + String.valueOf(contOvos));
    else
    ovosQuantLabel.setText(String.valueOf(contOvos));
    setContOvos(contOvos);
  }

  @FXML
  void adicionarPaoButton(ActionEvent event) {
    contPao += 1;
    if(contPao < 10)
    quantPaoLabel.setText('0' + String.valueOf(contPao));
    else
    quantPaoLabel.setText(String.valueOf(contPao));
    setContPao(contPao);
  }

  @FXML
  void adicionarPicanhaButton(ActionEvent event) {
    contPicanha += 1;
    if(contPicanha < 10)
    picanhaQuantLabel.setText('0' + String.valueOf(contPicanha));
    else
    picanhaQuantLabel.setText(String.valueOf(contPicanha));
    setContPicanha(contPicanha);
  }

  @FXML
  void adicionarQueijoButton(ActionEvent event) {
    contQueijo += 1;
    if(contQueijo < 10)
    queijoQuantLabel.setText('0' + String.valueOf(contQueijo));
    else
    queijoQuantLabel.setText(String.valueOf(contQueijo));
    setContQueijo(contQueijo);
  }

  @FXML
  void adicionarTomateButton(ActionEvent event) {
    contTomate += 1;
    if(contTomate < 10)
    tomateQuantLabel.setText('0' + String.valueOf(contTomate));
    else
    tomateQuantLabel.setText(String.valueOf(contTomate));
    setContTomate(contTomate);
  }

  @FXML
  void diminuirAlfaceButton(ActionEvent event) {
    if(contAlface > 0){
    contAlface -= 1;
    if(contAlface < 10)
    quantAlfaceLabel.setText('0' + String.valueOf(contAlface));
    else
    quantAlfaceLabel.setText(String.valueOf(contAlface));
    }
  }

  @FXML
  void diminuirBerinjelaButton(ActionEvent event) {
    if(contBerinjela > 0){
    contBerinjela -= 1;
    if(contBerinjela < 10)
    berinjelaQuantLabel.setText('0' + String.valueOf(contBerinjela));
    else
    berinjelaQuantLabel.setText(String.valueOf(contBerinjela));
    }
  }

  @FXML
  void diminuirCenouraButton(ActionEvent event) {
    if(contCenoura > 0){
    contCenoura -= 1;
    if(contCenoura < 10)
    cenouraQuantLabel.setText('0' + String.valueOf(contCenoura));
    else
    cenouraQuantLabel.setText(String.valueOf(contCenoura));
    }
  }

  @FXML
  void diminuirFrangoButton(ActionEvent event) {
    if(contFrango > 0){
    contFrango -= 1;
    if(contFrango < 10)
    frangoQuantLabel.setText('0' + String.valueOf(contFrango));
    else
    frangoQuantLabel.setText(String.valueOf(contFrango));
    }
  }

  @FXML
  void diminuirLeiteButton(ActionEvent event) {
    if(contLeite > 0){
    contLeite -= 1;
    if(contLeite < 10)
    leiteQuantLabel.setText('0' + String.valueOf(contLeite));
    else
    leiteQuantLabel.setText(String.valueOf(contLeite));
    }
  }

  @FXML
  void diminuirOvosButton(ActionEvent event) {
    if(contOvos > 0){
    contOvos -= 1;
    if(contOvos < 10)
    ovosQuantLabel.setText('0' + String.valueOf(contOvos));
    else
    ovosQuantLabel.setText(String.valueOf(contOvos));
    }
  }

  @FXML
  void diminuirPaoButton(ActionEvent event) {
    if(contPao > 0){
    contPao -= 1;
    if(contPao < 10)
    quantPaoLabel.setText('0' + String.valueOf(contPao));
    else
    quantPaoLabel.setText(String.valueOf(contPao));
    }
  }

  @FXML
  void diminuirPicanhaButton(ActionEvent event) {
    if(contPicanha > 0){
    contPicanha -= 1;
    if(contPicanha < 10)
    picanhaQuantLabel.setText('0' + String.valueOf(contPicanha));
    else
    picanhaQuantLabel.setText(String.valueOf(contPicanha));
    }
  }

  @FXML
  void diminuirQueijoButton(ActionEvent event) {
    if(contQueijo > 0){
    contQueijo -= 1;
    if(contQueijo < 10)
    queijoQuantLabel.setText('0' + String.valueOf(contQueijo));
    else
    queijoQuantLabel.setText(String.valueOf(contQueijo));
    }
  }

  @FXML
  void diminuirTomateButton(ActionEvent event) {
    if(contTomate > 0){
    contTomate -= 1;
    if(contTomate < 10)
    tomateQuantLabel.setText('0' + String.valueOf(contTomate));
    else
    tomateQuantLabel.setText(String.valueOf(contTomate));
    }
  }

  @FXML
  void finalizarCompraButton(ActionEvent event) {
    MercadoApp.changeScreenFinalizarCompra(event);
  }

  @FXML
  void finalizarCompraImageButton(MouseEvent event) {
    MercadoApp.changeScreenFinalizarCompra(event);
  }


  public String compraTotal () {
  String compraTotal = "Segue abaixo o carrinho de compras: \n\nQuantidade:            Produto:             Valor:";
  double totalAlface,totalPao, totalCenoura, totalBerinjela, totalTomate, totalPicanha, totalOvos, totalLeite, totalFrango, totalQueijo = 0;
    if (getContAlface() > 0) {
      totalAlface = getContAlface()*0.7;
      compraTotal += (getContAlface() + "            Alface             R$"+totalAlface+"\n");
    }
    if (getContPao() > 0) {
      totalPao = getContPao();      
      compraTotal += (getContPao() + "            Pão             R$"+totalPao+"\n");
    }
    if (getContCenoura() > 0) {
      totalCenoura = getContCenoura() * 1.2;
      compraTotal += (getContCenoura() + "            Cenoura             R$"+totalCenoura+"\n");
    }
    if (getContBerinjela() > 0) {  
      totalBerinjela = getContBerinjela() * 4.5;
      compraTotal += (getContBerinjela() + "            Berinjela             R$"+totalBerinjela+"\n");;
    }
    if (getContTomate() > 0) {
      totalTomate = getContTomate() * 0.9;
      compraTotal += (getContTomate() + "            Tomate             R$"+totalTomate+"\n");
    }
    if (getContPicanha()> 0) {
      totalPicanha = getContPicanha() * 60;
      compraTotal += (getContPicanha() + "            Picanha             R$"+totalPicanha+"\n");
    }
    if (getContOvos() > 0) {
      totalOvos = getContOvos() * 0.75;
      compraTotal += (getContOvos() + "            Ovos             R$"+totalOvos+"\n");
    }
    if (getContLeite() > 0) {
      totalLeite = getContLeite() * 6;
      compraTotal += (getContLeite() + "            Leite             R$"+totalLeite+"\n");
    }
    if (getContFrango() > 0) {
      totalFrango = getContFrango() * 40;
      compraTotal += (getContFrango() + "            Frango             R$"+totalFrango+"\n");
    }
    if (getContQueijo() > 0) {
      totalQueijo = getContQueijo() * 36;
      compraTotal += (getContQueijo() + "            Queijo             R$"+totalQueijo+"\n");
    }
    return compraTotal;
  }

  public int getContPao() {
    return contPao;
  }

  public void setContPao(int contPao) {
    this.contPao = contPao;
  }

  public int getContBerinjela() {
    return contBerinjela;
  }

  public void setContBerinjela(int contBerinjela) {
    this.contBerinjela = contBerinjela;
  }

  public int getContOvos() {
    return contOvos;
  }

  public void setContOvos(int contOvos) {
    this.contOvos = contOvos;
  }

  public int getContFrango() {
    return contFrango;
  }

  public void setContFrango(int contFrango) {
    this.contFrango = contFrango;
  }

  public int getContLeite() {
    return contLeite;
  }

  public void setContLeite(int contLeite) {
    this.contLeite = contLeite;
  }

  public int getContCenoura() {
    return contCenoura;
  }

  public void setContCenoura(int contCenoura) {
    this.contCenoura = contCenoura;
  }

  public int getContPicanha() {
    return contPicanha;
  }

  public void setContPicanha(int contPicanha) {
    this.contPicanha = contPicanha;
  }

  public int getContAlface() {
    return contAlface;
  }

  public void setContAlface(int contAlface) {
    this.contAlface = contAlface;
  }

  public int getContQueijo() {
    return contQueijo;
  }

  public void setContQueijo(int contQueijo) {
    this.contQueijo = contQueijo;
  }

  public int getContTomate() {
    return contTomate;
  }

  public void setContTomate(int contTomate) {
    this.contTomate = contTomate;
  }

}