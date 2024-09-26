/*
    3.  Faça um programa usando listas que armazene o código, o nome e o telefone de 100 pessoas. 
    O programa deve permitir que o usuário faça uma consulta dos dados de uma pessoa a partir de 
    seu código. Esta consulta pode ser repetida se o usuário desejar, caso contrário, o programa 
    deve ser encerrado.
*/

package aula4.listaExercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            ArrayList<String> cods = new ArrayList<>();
            ArrayList<Double> teles = new ArrayList<>();
            ArrayList<String> nomes = new ArrayList<>();
            int qnt = 2;

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira um nome: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome);
                System.out.print("Insira o numero de celular: ");
                    Double tele = scanner.nextDouble();
                    teles.add(tele);
                System.out.print("Insira o codigo: ");
                    String cod = scanner.nextLine();
                    cods.add(cod);
                scanner.nextLine();
            }

            char resp;
            do {
                System.out.print("Insira um cod: ");
                    String codSt = scanner.nextLine();

                int len=cods.size();
                for(int i=0; i<len; i++) {
                    if (cods.get(i).equals(codSt)) {
                        System.out.println(nomes.get(i) + " " + cods.get(i) + " " + teles.get(i));
                    }
                }

                scanner.nextLine();
                System.out.println("Continuar consulta (s)sim (n)nao: ");
                    resp = scanner.next(".").charAt(0);
            } while ((resp == 'S') || (resp == 's'));

            scanner.close();
        }
    }
}