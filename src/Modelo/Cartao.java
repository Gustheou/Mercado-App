package Modelo;

import Dados.DadosCartao;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Cartao implements Serializable {

  private String nomeDoTitularDoCartao;
  private String numeroDoCartao;
  private String mesDoVencimento;
  private String anoDoVencimento;
  private String cvv;
  private String endereco;
  private String cidade;

  public Cartao() {
  }

  public Cartao(String nomeDoTitularDoCartao, String numeroDoCartao, String mesDoVencimento,
      String anoDoVencimento, String cvv, String endereco,
      String cidade) {
    this.nomeDoTitularDoCartao = nomeDoTitularDoCartao;
    this.mesDoVencimento = mesDoVencimento;
    this.anoDoVencimento = anoDoVencimento;
    this.cvv = cvv;
    this.endereco = endereco;
    this.cidade = cidade;
    this.numeroDoCartao = numeroDoCartao;
  }

public String getNomeDoTitularDoCartao() {
  return nomeDoTitularDoCartao;
}

public void setNomeDoTitularDoCartao(String nomeDoTitularDoCartao) {
  this.nomeDoTitularDoCartao = nomeDoTitularDoCartao;
}

public String getMesDoVencimento() {
  return mesDoVencimento;
}

public void setMesDoVencimento(String mesDoVencimento) {
  this.mesDoVencimento = mesDoVencimento;
}

public String getAnoDoVencimento() {
  return anoDoVencimento;
}

public void setAnoDoVencimento(String anoDoVencimento) {
  this.anoDoVencimento = anoDoVencimento;
}

public String getCvv() {
  return cvv;
}

public void setCvv(String cvv) {
  this.cvv = cvv;
}

public String getEndereco() {
  return endereco;
}

public void setEndereco(String endereco) {
  this.endereco = endereco;
}

public String getCidade() {
  return cidade;
}

public void setCidade(String cidade) {
  this.cidade = cidade;
}

public String getNumeroDoCartao() {
  return numeroDoCartao;
}

public void setNumeroDoCartao (String numeroDoCartao){
  this.numeroDoCartao = numeroDoCartao;
}

public String tostring() {
  return "\nNúmero do cartão: "+getNumeroDoCartao();
}

public void cadastrarCartao(Cartao c) throws IOException, ClassNotFoundException, FileNotFoundException {
  DadosCartao dC = new DadosCartao();
  dC.cadastrarCartao(c);
}

public ArrayList<Cartao> listarCartao() throws IOException, ClassNotFoundException, FileNotFoundException {
  DadosCartao dC = new DadosCartao();
  return dC.listarCartao();
}

}