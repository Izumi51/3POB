/*
    Programa para adicionar e listar produtos   
*/

package aula6.alpha.controle;

import aula6.alpha.dominio.Produto;
import java.util.Scanner;

import java.util.ArrayList;

public class ControlaProduto {
    private ArrayList<Produto> produtos;

    public ControlaProduto () {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto (int id, String nome, double valor){
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        System.out.println("Produto adicionado");
    }

    public void listarProduto () {
        if (produtos.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }


    public static void main(String[] args) {
        ControlaProduto controle = new ControlaProduto();
        Scanner in = new Scanner(System.in);
        int op;

        do{
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar produto");
            System.out.println("2: Listar produto");
            System.out.println("0: Sair");
            System.out.println("Selecione uma opcao: ");
            op = in.nextInt();

            switch (op) {
                case 1:
                    in.nextLine();
                    System.out.println("Insira o nome do Produto:");
                    String nome = in.nextLine();
                    System.out.println("Insira o id do Produto: ");
                    int id = in.nextInt();
                    System.out.println("Insira o valor do Produto: ");
                    double valor = in.nextDouble();

                    controle.adicionarProduto(id, nome, valor);
                break;

                case 2:
                    controle.listarProduto();
                break;
                
                case 0:
                    System.out.println("Encerrado");
                break;
            
                default:
                    System.out.println("invalido");
                break;
            }
        }while (op != 0);

        in.close();
    }   
}
