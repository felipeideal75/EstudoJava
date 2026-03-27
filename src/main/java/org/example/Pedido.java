package org.example;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Sushi> itens;

    //construtor
    public Pedido(){
        this.itens = new ArrayList<>();
    }
    //adicionar sushi
    public void adicionarSushi(Sushi sushi){
        itens.add(sushi);
    }
    //soma total
    public double calcularTotalPedido(){
        double total = 0;
        for (Sushi s : itens){
            total += s.calcularTotal();
        }
        return total;
    }
    //exibe pedido
    public void exibirPedido(){
        System.out.println("=== PEDIDO ===");
        for (Sushi s : itens){
            System.out.println(s.getNome() + " |peças: " + s.getQuantidadePecas()+ " |R$ " + String.format("%.2f", s.calcularTotal())
            );
        }

        System.out.println("---------------------");
               System.out.println("Total: R$" + String.format("%.2f", calcularTotalPedido()));

    }

}
