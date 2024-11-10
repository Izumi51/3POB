package aula6.charlie.controle;

import aula6.charlie.dominio.Produto;
import aula6.echo.dominio.Paciente;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ControlaProduto {
    private ArrayList<Produto> produtos;
    private final String arquivoProdutos = "produtos.txt";

    public ControlaProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto prod = new Produto(id, nome, valor);
        produtos.add(prod);
        salvarProdutos();
    }

    public void alterarProduto() {

    }

    public void excluirProduto() {

    }

    public void lstUm() {

    }
    public void lstTodos() {

    }

    /*
    public ControlaProduto() {
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        salvarProdutos();
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }

    public void alterarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome do produto: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo valor do produto: ");
            double novoValor = scanner.nextDouble();

            produto.setNome(novoNome);
            produto.setValor(novoValor);
            salvarProdutos();
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            salvarProdutos();
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // Método para salvar produtos no arquivo
    private void salvarProdutos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoProdutos))) {
            for (Produto produto : produtos) {
                writer.write(produto.getId() + ";" + produto.getNome() + ";" + produto.getValor());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    // Método para carregar produtos do arquivo
    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoProdutos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double valor = Double.parseDouble(dados[2]);
                produtos.add(new Produto(id, nome, valor));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }
}

    */

    public static void main(String[] args) {
        ControlaProduto control = new ControlaProduto();
        Scanner in = new Scanner(System.in);

        do {
            int op;
            int id;
            String nome;
            double valor;

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
