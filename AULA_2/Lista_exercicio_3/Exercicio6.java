/* 
    6.  Elabore um programa que leia a idade de diversas pessoas e ao final informe: 
    o total de pessoas cadastradas, a porcentagem de pessoas com idade inferior a 18 anos, 
    a porcentagem de pessoas com idade igual ou superior a 18 anos.

*/

package AULA_2.Lista_exercicio_3;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {   
            boolean cond = true;
            int sup = 0;
            int inf = 0;
            
            while (cond)
            {
                System.out.print("Insira sua idade: ");
                int idade = scanner.nextInt();

                if (idade >= 18)
                { 
                    sup += 1;
                }else{
                    if ((idade < 18) && (idade > 0))
                    {
                        inf += 1;
                    }else{
                        cond = false;
                    }
                }
            }

            int total = sup + inf;
            double porcentSup = (sup * 100) / total;
            double porcentInf = (inf * 100) / total;
      
            System.out.println("Superior: " + porcentSup);
            System.out.println("Inferior: " + porcentInf);
            System.out.println("Total: " + total);

            scanner.close();
        }
    }
}
