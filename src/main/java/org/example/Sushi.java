package org.example;
public class Sushi{
    private String nome;
    private int quantidadePecas;
    private double precoUnitario;

    public Sushi(String nome, int quantidadePecas, double precoUnitario){
        setNome(nome);
        setQuantidadePecas(quantidadePecas);
        setPrecoUnitario(precoUnitario);

    }
    public double calcularTotal(){
        return quantidadePecas * precoUnitario;
    }
    //getter nome
    public String getNome(){
        return nome;
    }
    //setter nome com validação
    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("NOME NÃO PODE SER VAZIO");
        }
        this.nome = nome;
    }



    //getter quantidade
    public int getQuantidadePecas(){
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas){
        if (quantidadePecas < 0){
           throw new  IllegalArgumentException("quantidade não pode ser negativa");
        }
        this.quantidadePecas = quantidadePecas;
    }


    //getter preço
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario){
        if (precoUnitario< 0){
          throw new  IllegalArgumentException("preço não pode ser negativo");
        }
        this.precoUnitario = precoUnitario;
    }





}