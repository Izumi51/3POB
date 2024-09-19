/*
    11. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
    Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário 
    para que essa massa se torne menor do que 0.5 gramas. Escreva a massa final, e o tempo. 
    Observação: o usuário deve digitar a massa inicial.
*/

package aula2.lista_exercicio_3;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Insira uma massa: ");
            double massa = scanner.nextDouble();

            double massaDiv = massa;
            int i = 0;

            while (massaDiv > 0.5)
            {
                massaDiv /= 2;
                i++;
            }

            double temp = 50 * i;

            System.out.println("O material de massa: " + massa + " demorou " + temp + " segundos para chegar em " + massaDiv);

            scanner.close();
        }
    }
}
