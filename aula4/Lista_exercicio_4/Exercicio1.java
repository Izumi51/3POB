/*
    1.  Faça um programa utilizando listas que leia o nome e a altura de 50 pessoas e ao final 
    escreva o nome e a altura das pessoas com mais de 1,70 metros.
*/

package aula4.lista_exercicio_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // ArrayList
        try (Scanner scanner = new Scanner(System.in))
        {
            int qnt = 50;
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<Double> alturas = new ArrayList<>();

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira seu nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);
                System.out.print("Insira sua altura: ");
                Double altura = scanner.nextDouble();
                alturas.add(altura);
                System.out.print("\n");
                scanner.nextLine(); //cancelar espacos em branco
            }

            for (int i = 0; i < alturas.size(); i++)
            {
                if (alturas.get(i) > 1.70)
                {
                    System.out.println(nomes.get(i) + " " + alturas.get(i));
                }
            }

            scanner.close();
        }

    }

    /*
        Array normal

        public static void main(String[] args) {
            
            try (Scanner scanner = new Scanner(System.in))
            {
                int qnt = 50;
                String nomes[] = new String[qnt];    
                float alturas[] = new float[qnt];

                for (int i = 0; i < qnt; i++)
                {
                    System.out.print("Insira seu nome: ");
                    nomes[i] = scanner.nextLine();
                    System.out.print("Insira sua altura: ");
                    alturas[i] = scanner.nextFloat();
                    System.out.print("\n");
                    scanner.nextLine(); //cancelar espacos em branco
                }

                for (int i = 0; i < qnt; i++)
                {
                    if (alturas[i] > 1.70)
                    {
                        System.out.println(nomes[i] + " " + alturas[i]);
                    }
                }

                scanner.close();
            }

        } 
    */    
}
