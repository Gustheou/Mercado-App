package Dados;

import java.io.*;
import java.util.ArrayList;
import Modelo.Produto;

public class DadosProdutos {

  public void cadastrarProduto(Produto c) throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Produto> Produtos = new ArrayList<>();
    File arq = new File("listaProdutos.ser");
    if (arq.exists()) {
      Produtos = listarProdutos();
    }
    Produtos.add(c);
    FileOutputStream fluxo = new FileOutputStream(arq);
    try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
      gravarObj.writeObject(Produtos);
    }
  }
    
  public ArrayList<Produto> listarProdutos() throws FileNotFoundException, IOException, ClassNotFoundException {
    ArrayList<Produto> produtos;
    File arq = new File("listaProdutos.ser");
    FileInputStream fluxo = new FileInputStream(arq);
    ObjectInputStream lerObj = new ObjectInputStream(fluxo);
    produtos = (ArrayList<Produto>) lerObj.readObject();
    lerObj.close();
    return produtos;
  }

  public void removerProduto(String nome) throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
    ArrayList<Produto> produtos = new ArrayList<>();
    File arq = new File("listaProdutos.ser");
    if (arq.exists()) {
      produtos = listarProdutos();
    }
    for (int i = 0; i < produtos.size(); i++) {
      if(nome.equals(produtos.get(i).getNome())) {
        produtos.remove(i);
        break;
      }
    }
    FileOutputStream fluxo = new FileOutputStream(arq);
    try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
        gravarObj.writeObject(produtos);
    }
  }

}
