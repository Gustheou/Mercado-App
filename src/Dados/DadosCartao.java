package Dados;

import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import Modelo.Cartao;

public class DadosCartao {

  public void cadastrarCartao(Cartao c) throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Cartao> cartao = new ArrayList<>();
    File arq = new File("listaCartao.ser");
    if (arq.exists()) {
      cartao = listarCartao();
    }
    cartao.add(c);
    FileOutputStream fluxo = new FileOutputStream(arq);
    try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
      gravarObj.writeObject(cartao);
    }
  }

  public ArrayList<Cartao> listarCartao() throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Cartao> cartao;
    File arq = new File("listaCartao.ser");
    FileInputStream fluxo = new FileInputStream(arq);
    ObjectInputStream lerObj = new ObjectInputStream(fluxo);

    cartao = (ArrayList<Cartao>) lerObj.readObject();
    return cartao;
  }
}
