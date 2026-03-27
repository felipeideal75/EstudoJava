package org.example;

public class Main {
    public static void main(String[] args) {
        Sushi s = new Sushi("Temaki Salmão", (int) 5.50, 10);
        s.exibirInfo();
        System.out.println("Total: R$ " + String.format("%.2f", s.calcularTotal()));
    }
}