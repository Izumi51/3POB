package aula7.interface2.controle;

import java.util.Scanner;

import aula7.interface2.dominio.FiguraGeo;
import aula7.interface2.dominio.Quadrado;
import aula7.interface2.dominio.Triangulo;

public class ControlaFigura {
    private Scanner in;

    public ControlaFigura () {
        this.in = new Scanner(System.in);
    }

    public void init () {
        int op = 0;

        do {
            System.out.println("\n---Menu---");
            System.out.println("1: Criar Quadrado");
            System.out.println("2: Criar Triangulo");
            System.out.println("0: Sair");
            System.out.println("Escolha uma operacao");
            op = in.nextInt();

            switch (op) {
                case 1:
                    criarQuadrado();
                    break;

                case 2:
                    criarTriangulo();
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("Opcao invalida!!");
                    break;
            }

        } while (op != 0);
    }

    public void criarQuadrado() {
        System.out.println("Insira o lado do Quadrado: ");
        int lado = in.nextInt();

        Quadrado quad = new Quadrado(lado);

        exibirInf(quad);
    }

    public void criarTriangulo() {
        System.out.println("Insira a base do Triangulo: ");
        int base = in.nextInt();
        System.out.println("Insira a altura do Triangulo: ");
        int altura = in.nextInt();
        System.out.println("Insira o ladoA do Triangulo: ");
        int ladoA = in.nextInt();
        System.out.println("Insira o ladoB do Triangulo: ");
        int ladoB = in.nextInt();
        System.out.println("Insira o ladoC do Triangulo: ");
        int ladoC = in.nextInt();

        Triangulo tria = new Triangulo(altura, base, ladoA, ladoB, ladoC);

        exibirInf(tria);
    }

    public void exibirInf (FiguraGeo figura) {
        System.out.println("Nome: " + figura.getNome());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
    } 

    public static void main(String[] args){
        ControlaFigura control = new ControlaFigura();
        control.init();
    }
}
