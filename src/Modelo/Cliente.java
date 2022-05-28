package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import Dados.DadosCliente;

public class Cliente implements Serializable {
  private String nome;
  private String dataNascimento;
  private String endereco;
  private String cpf;
  private String email;
  private String senha;

  public Cliente(String nome, String dataNascimento, String endereco, String cpf, String email, String senha) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;
    this.cpf = cpf;
    this.email= email;
    this.senha= senha;
  }

  public Cliente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void cadastrarCliente(Cliente c) throws IOException, ClassNotFoundException, FileNotFoundException {
    DadosCliente dc = new DadosCliente();
    dc.cadastrarCliente(c);
  }

  public ArrayList<Cliente> listarCliente() throws IOException, ClassNotFoundException, FileNotFoundException {
    DadosCliente dc = new DadosCliente();
    return dc.listarCliente();
  }  
}