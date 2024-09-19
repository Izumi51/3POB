package aula1;

import java.util.Scanner;

public class pontos {
    public static void main (String[] args) {
    
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite o numero de vitoria: ");
            int vitoria = leia.nextInt();
            
            System.out.print("Digite o numero de derrotas: ");
            int derrota = leia.nextInt();
            
            System.out.print("Digite o numero de empates: ");
            int empate = leia.nextInt();
            
            int jogos = vitoria + derrota + empate;
            int pontosGanhos = (vitoria * 3) + (empate * 1);
            int pontosPerdidos = (derrota * 3) + (empate * 2);
            double aproveitamento = (pontosGanhos / (jogos * 3.0)) * 100.0;
            
            System.out.println("Jogos: " + jogos);
            System.out.println("Pontos Ganhos: " + pontosGanhos);
            System.out.println("Pontos Perdidos: " + pontosPerdidos);
            System.out.println("Aproveitamento: " + aproveitamento + "%");

            leia.close();
        }
    }
}