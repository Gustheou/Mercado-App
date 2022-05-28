package Controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import Modelo.Cartao;

public class ControleCartao {
  public void cadastrarCartao (String nomeDoTitularDoCartao, String numeroDoCartao, String mesDoVencimento,
                            String anoDoVencimento, String cvv, String endereco,String cidade) throws ClassNotFoundException, FileNotFoundException, IOException{

    Cartao c = new Cartao(nomeDoTitularDoCartao, numeroDoCartao, mesDoVencimento, anoDoVencimento,  cvv, endereco, cidade);
    c.cadastrarCartao(c);
  }

  public ArrayList<Cartao> listarCartao() throws IOException, FileNotFoundException, ClassNotFoundException {
    Cartao c = new Cartao();
    return c.listarCartao();
  }

  public Cartao pesquisarCartao (String numero) throws IOException, ClassNotFoundException, FileNotFoundException {
    Cartao c =  null;
    ArrayList<Cartao> cartoes = listarCartao();
    for (int i = 0; i <cartoes.size();i++) {
      if (numero.equals(cartoes.get(i).getNumeroDoCartao())) {
        c = cartoes.get(i);
        break;
      }
    }
    return c; 
  }
}