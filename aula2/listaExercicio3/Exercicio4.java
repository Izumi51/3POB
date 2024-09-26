/*
    4.  Elabore um programa que leia o sexo de um número indeterminado de pessoas. 
    Ao final escreva a quantidade de pessoas cadastradas e o total de pessoas  de cada sexo. 
*/

package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            boolean cond = true;
            int mas = 0;
            int fem = 0;
            
            while (cond)
            {
                System.out.print("Insira seu sexo (m) ou (f): ");
                String sexo = scanner.nextLine();

                if (("M".equals(sexo)) || ("m".equals(sexo)))
                { 
                    mas += 1;
                }else{
                    if (("F".equals(sexo)) || ("f".equals(sexo)))
                    {
                        fem += 1;
                    }else{
                        cond = false;
                    }
                }

            }

            int total = mas + fem;
      
            System.out.println("masculino: " + mas);
            System.out.println("Feminino: " + fem);
            System.out.println("Total: " + total);

            scanner.close();
        }
    }
}
