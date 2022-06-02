package Dados;

import java.io.*;
import java.util.ArrayList;
import Modelo.Cliente;

public class DadosCliente {

  public void cadastrarCliente(Cliente c) throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Cliente> clientes = new ArrayList<>();
    File arq = new File("listaClientes.ser");
    if (arq.exists()) {
      clientes = listarCliente();
    }
    clientes.add(c);
    FileOutputStream fluxo = new FileOutputStream(arq);
    try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
      gravarObj.writeObject(clientes);
    }
  }

  public ArrayList<Cliente> listarCliente() throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Cliente> clientes;
    File arq = new File("listaClientes.ser");
    FileInputStream fluxo = new FileInputStream(arq);
    ObjectInputStream lerObj = new ObjectInputStream(fluxo);
    clientes = (ArrayList<Cliente>) lerObj.readObject();
    lerObj.close();
    return clientes;
  }

  
  public void substituir(String cpf, String usuario, String novaSenha) throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
    ArrayList<Cliente> clientes = new ArrayList<>();
    File arq = new File("listaClientes.ser");
    if (arq.exists()) {
      clientes = listarCliente();
    }
    for (int i = 0; i < clientes.size(); i++) {
        if (cpf.equals(clientes.get(i).getCpf()) && usuario.equals(clientes.get(i).getNome()));{
          clientes.get(i).setSenha(novaSenha);
          break;
        }
      }
    FileOutputStream fluxo = new FileOutputStream(arq);
    try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
        gravarObj.writeObject(clientes);
    }
  }
}
