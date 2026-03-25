package org.example;

public class Main {
    public static void main(String[] args) {
        Pedido  pedido = new Pedido();

        pedido.adicionarSushi(new Sushi("temaki salmão", 10, 5.5));
        pedido.adicionarSushi(new Sushi("niguiri atum", 6, 8.0));
        pedido.adicionarSushi(new Sushi("uramaki camarão", 8, 7.0));

        pedido.exibirPedido();

    }
}
