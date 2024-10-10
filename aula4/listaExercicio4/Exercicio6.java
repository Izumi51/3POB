/*
    6.  Elabore um programa utilizando listas para armazenar 10 números e ao final escreva a 
    quantidade de números negativos, positivos e nulos.
*/

package aula4.listaExercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            ArrayList<Integer> num = new ArrayList<>();
            int qnt = 10;

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira um numero: ");
                    num.add(scanner.nextInt());
            }
            
            int posi, neg, nulo;
            posi =  neg = nulo = 0;

            for (int i = 0; i < qnt; i++)
            {
                if (num.get(i) > 0) {
                    posi++;
                }else if(num.get(i)  == 0){
                    nulo++;
                }else{
                    neg++;
                }

            }

            System.out.println(posi);
            System.out.println(neg);
            System.out.println(nulo);
            
            scanner.close();
        }
    }
}