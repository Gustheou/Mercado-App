package Modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Dados.DadosProdutos;

public class Produto {
   private String nome;
   private int quant;
   private double preco;


   public Produto(){}

   public Produto(String nome, int quant, double preco){
      this.nome = nome;
      this.quant = quant;
      this.preco = preco;
   }

   
   public String getNome(){
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public double getPreco() {
      return preco;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public int getQuant() {
      return quant;
   }

   public void setQuant(int quant) {
      this.quant = quant;
   }

   //metodos 

   public void cadastrarProdutos() throws IOException, FileNotFoundException, ClassNotFoundException{
      DadosProdutos dp = new DadosProdutos();
      dp.cadastrarProduto(this);
   }

   public void removerProd(String nome) throws IOException, FileNotFoundException, ClassNotFoundException{
      DadosProdutos dp = new DadosProdutos();
      dp.removerProduto(nome);
   }

   public ArrayList<Produto> listarProfs() throws IOException, ClassNotFoundException {
      DadosProdutos dp = new DadosProdutos();
      return dp.listarProdutos();

  }

}
