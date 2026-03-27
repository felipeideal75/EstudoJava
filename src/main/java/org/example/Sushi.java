package org.example;

public class Sushi extends  Prato {
    private int quantidadePecas;


public Sushi(String nome,double preco, int quantidadePecas){
    super(nome, preco);
    this.quantidadePecas = quantidadePecas;;

}


    public double calcularTotal(){
        return quantidadePecas * getPreco();
    }
public void setQuantidadePecas(int quantidadePecas) {
    if (quantidadePecas < 0 ){
        throw new IllegalArgumentException("peças não podem ser negativas");
    }
    this.quantidadePecas = quantidadePecas;
}
public int getQuantidadePecas(){
    return quantidadePecas;
}





}
