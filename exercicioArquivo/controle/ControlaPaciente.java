//Construa uma aplicação utilizando arquivo de texto para realizar operações de inclusão,
// alteração, exclusão e consulta de dados de pacientes de um hospital.

package exercicioArquivo.controle;

import exercicioArquivo.dominio.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlaPaciente {
    private ArrayList<Paciente> pacientes;
    private final String arquivoPacientes = "paciente.txt";

    public ControlaPaciente() {
        this.pacientes = new ArrayList<>();
        carregarPacientes();
    }

    public void adicionarPaciente(int numero, double peso, double altura) {
        Paciente Paciente = new Paciente(numero, peso, altura);
        pacientes.add(Paciente);
        salvarPacientes();
    }

    public void excluirPaciente(int numero) {
        Paciente pacie = buscarPaciente(numero);

        if (pacie != null) {
            pacientes.remove(pacie);
        } else {
            System.out.println("Paciente nao encontrado!");
        }
    }

    public void listarTodosPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            for (Paciente Paciente : pacientes) {
                Paciente.listarPaciente();
            }
        }
    }

    public void listarUmPaciente(int numero) {
        Paciente pacie = buscarPaciente(numero);

        if (pacie != null) {
            pacie.listarPaciente();
        }else{
            System.out.println("Paciente nao encontrado");
        }
    }

    public void alterarPaciente(int numero) {
        Paciente pacie = buscarPaciente(numero);

        if (pacie != null) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira um novo peso: ");
            double peso = in.nextDouble();
            System.out.println("Insira um novo altura: ");
            double altura = in.nextDouble();

            pacie.setPeso(peso);
            pacie.setAltura(altura);

            in.close();
        } else {
            System.out.println("Paciente nao encontrado!");
        }

    }

    private Paciente buscarPaciente(int numero) {
        for (Paciente pacie : pacientes) {
            if (pacie.getNumero() == numero){
                return pacie;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        aula6.echo.controle.ControlaPaciente control = new aula6.echo.controle.ControlaPaciente();
        Scanner in = new Scanner(System.in);
        int op;

        int numero;
        double peso;
        double altura;

        do {

            System.out.println("\n---------MENU-----------");
            System.out.println("1: Adicionar Paciente");
            System.out.println("2: Alterar Paciente");
            System.out.println("3: Excluir Paciente");
            System.out.println("4: Listar um Paciente");
            System.out.println("5: Listar todos Paciente");
            System.out.println("0: Sair");
            System.out.println("Selecione uma opcao: ");
            op = in.nextInt();
            System.out.println("------------------------");

            switch(op) {
                case 0:
                    break;
                case 1:
                    System.out.println("Insira o numero do Paciente: ");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.println("Insira o peso do Paciente: ");
                    peso = in.nextDouble();
                    System.out.println("Insira o altura do Paciente: ");
                    altura = in.nextDouble();

                    control.adicionarPaciente(numero, peso, altura);
                    break;

                case 2:
                    System.out.println("Insira o numero do Paciente a ser alterado: ");
                    numero = in.nextInt();

                    control.alterarPaciente(numero);
                    break;

                case 3:
                    System.out.println("Insira o numero do Paciente a ser exclunumeroo: ");
                    numero = in.nextInt();

                    control.excluirPaciente(numero);
                    break;

                case 4:
                    System.out.println("Insira o numero do Paciente a ser listado: ");
                    numero = in.nextInt();

                    control.listarUmPaciente(numero);
                    break;

                case 5:
                    control.listarTodosPaciente();
                    break;

                default:
                    System.out.println("Opcao invalnumeroa!!");
                    break;
            }

        } while(op != 0);

        in.close();
    }
}