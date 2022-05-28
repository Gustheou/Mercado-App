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
    return clientes;
  }
}
