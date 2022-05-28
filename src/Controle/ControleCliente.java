package Controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import Modelo.Cliente;

public class ControleCliente {

  public void cadastrarCliente(String nome, String dataNascimento, String endereco, String cpf, String email,
      String senha) throws ClassNotFoundException, FileNotFoundException, IOException {

    Cliente c = new Cliente(nome, dataNascimento, endereco, cpf, email, senha);
    c.cadastrarCliente(c);
  }

  /*
   * public String imprimirCliente() throws IOException, FileNotFoundException,
   * ClassNotFoundException {
   * String cliente = "";
   * ArrayList<Cliente> c = listarPaciente();
   * for (int i = 0; i < c.size(); i++) {
   * cliente += c.get(i).toString() + "\n=-=-=-=-=-=-=-=-=-=-=-=\n";
   * }
   * return cliente;
   * }
   */

  public ArrayList<Cliente> listarCliente() throws IOException, FileNotFoundException, ClassNotFoundException {
    Cliente c = new Cliente();
    return c.listarCliente();
  }

  public Cliente pesquisarCliente(String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
    Cliente c = null;
    ArrayList<Cliente> clientes = listarCliente();
    for (int i = 0; i < clientes.size(); i++) {
      if (cpf.equals(clientes.get(i).getCpf())) {
        c = clientes.get(i);
        break;
      }
    }
    return c;
  }

  public boolean pesquisarLoginMenu(String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
    ArrayList<Cliente> clientes = listarCliente();
    for (int i = 0; i < clientes.size(); i++) {
      if (cpf.equals(clientes.get(i).getCpf())) {
        return true;
      }
    }
    return false;
  }

  public boolean pesquisarSenhaMenu(String senha) throws IOException, ClassNotFoundException, FileNotFoundException {
    ArrayList<Cliente> clientes = listarCliente();
    for (int i = 0; i < clientes.size(); i++) {
      if (senha.equals(clientes.get(i).getSenha())) {
        return true;
      }
    }
    return false;
  }
}