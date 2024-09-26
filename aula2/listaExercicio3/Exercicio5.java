/*
    5.  Crie um programa que leia a altura de um número indeterminado de pessoas. 
    Ao final o programa deve informar o total de pessoas cadastradas, a quantidade 
    de pessoas com altura inferior a 1,60 metros; a quantidade de pessoas com altura 
    entre 1,60 metros e 1,80 metros e a quantidade de pessoas com altura superior a 1,80 metros.
*/

package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            boolean cond = true;
            int inf = 0;
            int sup = 0;
            int ent = 0;
            
            while (cond)
            {
                System.out.print("Insira sua altura: ");
                double altura = scanner.nextFloat();

                if (altura > 1.80)
                { 
                    sup += 1;
                }else{
                    if ((altura < 1.60) && (altura > 0))
                    {
                        inf += 1;
                    }else{
                        if ((altura > 1.60) && (altura < 1.80))
                        {
                            ent += 1;
                        }else{
                            cond = false;
                        }
                    }
                }

            }

            int total = sup + inf + ent;
      
            System.out.println("Superior: " + sup);
            System.out.println("Inferior: " + inf);
            System.out.println("Entre: " + ent);
            System.out.println("Total: " + total);

            scanner.close();
        }
    }
}
