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
        ArrayList<Produto> Produtos;
        File arq = new File("listaProdutos.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        Produtos = (ArrayList<Produto>) lerObj.readObject();
        return Produtos;
      }

      public void removerProduto(String nome)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Produto> Produtos = new ArrayList<>();
        File arq = new File("listaProdutos.ser");

        if (arq.exists()) {
            Produtos = listarProdutos();
        }

        for (int i = 0; i < Produtos.size(); i++) {
            if (nome.equals(Produtos.get(i).getNome())) {
                Produtos.remove(i);
                break;
            }
        }

        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(Produtos);
        }
    }
}
