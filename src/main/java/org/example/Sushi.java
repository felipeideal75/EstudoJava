package org.example;

public class Sushi extends Prato {
    private int quantidadePecas;

    public Sushi(String nome, double preco, int quantidadePecas) {
        super(nome, preco);
        setQuantidadePecas(quantidadePecas);
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        if (quantidadePecas < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.quantidadePecas = quantidadePecas;
    }

    public double calcularTotal() {
        return quantidadePecas * getPreco();
    }
}