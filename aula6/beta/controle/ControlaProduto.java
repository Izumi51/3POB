/*
    Programa de CRUD de produtos
*/

package aula6.beta.controle;

import java.util.Scanner;
import java.util.ArrayList;
import aula6.beta.dominio.Produto;

public class ControlaProduto {
    private ArrayList<Produto> produtos;

    public ControlaProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
    }

    public void excluirProduto(int id) {
        Produto prod = buscarProduto(id);

        if (prod != null) {
            produtos.remove(prod);
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }    

    public void listarTodosProduto() {
        if (produtos.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }

    public void listarUmProduto(int id) {
        Produto prod = buscarProduto(id);

        if (prod != null) {
            prod.listarProduto();
        }else{
            System.out.println("Produto nao encontrado");
        }
    }

    public void alterarProduto(int id) {
        Produto prod = buscarProduto(id);
        
        if (prod != null) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira um novo nome: ");
                String nome = in.nextLine();
            System.out.println("Insira um novo valor: ");
                double valor = in.nextDouble();

            prod.setNome(nome);
            prod.setValor(valor);
            
            in.close();
        } else {
            System.out.println("Produto nao encontrado!");
        }

    }

    private Produto buscarProduto(int id) {
        for (Produto prod : produtos) {
            if (prod.getId() == id){
                return prod;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ControlaProduto control = new ControlaProduto();
        Scanner in = new Scanner(System.in);
        int op;

        int id;
        String nome;
        double valor;

        do {

            System.out.println("\n---------MENU-----------");
            System.out.println("1: Adicionar produto");
            System.out.println("2: Alterar produto");
            System.out.println("3: Excluir produto");
            System.out.println("4: Listar um produto");
            System.out.println("5: Listar todos produto");
            System.out.println("0: Sair");
            System.out.println("Selecione uma opcao: ");
            op = in.nextInt();
            System.out.println("------------------------");

            switch(op) {
                case 0:
                    break;
                case 1:
                    System.out.println("Insira o ID do produto: ");    
                        id = in.nextInt();
                        in.nextLine();
                    System.out.println("Insira o Nome do produto: ");   
                        nome = in.nextLine(); 
                    System.out.println("Insira o Valor do produto: ");    
                        valor = in.nextDouble();

                    control.adicionarProduto(id, nome, valor);                  
                    break;

                case 2:
                    System.out.println("Insira o ID do produto a ser alterado: ");
                        id = in.nextInt();
                    break;

                case 3:
                    System.out.println("Insira o ID do produto a ser excluido: ");    
                        id = in.nextInt();

                    control.excluirProduto(id);
                    break;

                case 4:
                    System.out.println("Insira o ID do produto a ser listado: ");    
                    id = in.nextInt();

                    control.listarUmProduto(id);
                    break;
                
                case 5:
                    control.listarTodosProduto();
                    break;

                default:
                    System.out.println("Opcao invalida!!");
                    break;
            }

        } while(op != 0);

        in.close();
    }
}