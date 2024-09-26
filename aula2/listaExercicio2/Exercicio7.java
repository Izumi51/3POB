// 7- Elabore um programa que leia três números diferentes e informe o maior deles.

package aula2.listaExercicio2;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            int v[] = new int[3];

            System.out.print("Insira um numero: ");
            v[0] = scanner.nextInt();
            System.out.print("Insira um numero: ");
            v[1] = scanner.nextInt();
            System.out.print("Insira um numero: ");
            v[2] = scanner.nextInt();

            int maior = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if (v[i] > maior)
                    maior = v[i];
            }

            System.out.print(maior);
        }
    }
}
