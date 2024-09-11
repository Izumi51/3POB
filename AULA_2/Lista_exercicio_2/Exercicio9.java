/*
 * 9- Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos lados de um triângulo 
 * e, se forem, verificar se é um triângulo, equilátero, isósceles ou escaleno. Se eles não 
 * formarem um triângulo, escreverem uma mensagem. 
 * 
 * Obs: O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
 * outros dois lados; 
 * chama-se triângulo equilátero ao triângulo que tem os comprimentos dos três lados iguais; 
 * chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados iguais. 
 * Portanto, todo triângulo equilátero é também isósceles; chama-se triângulo escaleno ao 
 * triângulo que tem os comprimentos dos três lados diferentes.
 */

package AULA_2.Lista_exercicio_2;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            int v[] = new int[3];

            System.out.print("Insira um numero: ");
            v[0] = scanner.nextInt();
            System.out.print("Insira um numero: ");
            v[1] = scanner.nextInt();
            System.out.print("Insira um numero: ");
            v[2] = scanner.nextInt();

            boolean eTriangulo = true;

            if (v[0] > (v[1] + v[2])){
                eTriangulo = false;
            }else
            {
                if (v[1] > (v[0] + v[2]))
                {
                    eTriangulo = false;
                }else
                {
                    if (v[2] > (v[0] + v[1]))
                    {
                        eTriangulo = false;
                    }
                }
            }

            String tipo = "";

            if (eTriangulo == true)
            {
                if ((v[0] == v[1]) && (v[1] == v[2]))
                {
                    tipo = "equilatero";
                }else{
                    if ((v[0] == v[1]) || (v[1] == v[2]))
                    {
                        tipo = "isosceles";
                    }else{
                        tipo = "escaleno";
                    }
                }

                System.out.print(tipo);
            }else{
                System.out.print("nao e triangulo");
            }

            scanner.close();
        }
    }
}
