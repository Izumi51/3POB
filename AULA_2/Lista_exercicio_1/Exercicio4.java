/* 
    4-  O camelô Zé da banca vende diariamente, games, calculadoras e canetas. 
    Faça um programa para solicitar o total de games, o total de calculadoras 
    e o total de canetas vendidas ao término do dia. O programa deve solicitar 
    também o preço de cada um dos produtos e ao final calcular e informar o 
    total do faturamento com cada produto e o faturamento total.
*/

package AULA_2.Lista_exercicio_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Total de games vendidos: ");
        int totalGames = scanner.nextInt();
        System.out.print("Insira o valor da unidade do game: ");
        double valorGame = scanner.nextDouble();

        System.out.print("Total de calculadoras vendidos: ");
        int totalCalculadoras = scanner.nextInt();
        System.out.print("Insira o valor da unidade da calculadora: ");
        double valorCalculadoras = scanner.nextDouble();

        System.out.print("Total de canetas vendidos: ");
        int totalCanetas = scanner.nextInt();
        System.out.print("Insira o valor da unidade do caneta: ");
        double valorCanetas = scanner.nextDouble();

        double vendasGames = (double) totalGames * valorGame;
        double vendasCalculadoras = (double) totalCalculadoras * valorCalculadoras;
        double vendasCanetas = (double) totalCanetas * valorCanetas;

        double totalVendas = vendasCalculadoras + vendasCanetas + vendasGames;

        System.out.println("Vendas de games: " + df.format(vendasGames));
        System.out.println("Vendas de canetas: " + df.format(vendasCanetas));
        System.out.println("Vendas de Calculadoras: " + df.format(vendasCalculadoras));
        System.out.println("Total de vendas: " + df.format(totalVendas));

        scanner.close();
    }
}
