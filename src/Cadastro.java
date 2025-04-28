import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();

        int opcao;
        while (true) {
            System.out.println("Bem vindo ao sistema de cadastro de funcionários e gerentes!");
            System.out.println("O que deseja fazer?");
            System.out.println("\n1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Listar Gerentes");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                case 1:
                    cadastrarFuncionario(scanner, funcionarios);
                    break;

                case 2:
                    cadastrarGerente(scanner, gerentes);
                    break;

                case 3:
                    listarFuncionarios(scanner, funcionarios);
                    break;

                case 4:
                    listarGerentes(scanner, gerentes);
                    break;
            }
        }
    }

    public static void cadastrarFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.next();
        System.out.print("Digite o salário do funcionario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        Funcionario f = new Funcionario(nome, salario);
        funcionarios.add(f);
        System.out.print("Funcionário cadastrado com sucesso!");
        System.out.println("(Pressione Enter para continuar.)");
        scanner.nextLine();
    }

    public static void cadastrarGerente(Scanner scanner, ArrayList<Gerente> gerentes) {
        System.out.print("Digite o nome do gerente: ");
        String nome = scanner.next();
        System.out.print("Digite o salário do gerente: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a quantidade de bônus do gerente: ");
        double bonusExtra = scanner.nextDouble();
        Gerente g = new Gerente(nome, salario, bonusExtra);
        gerentes.add(g);
        System.out.print("Gerente cadastrado com sucesso!");
        System.out.println("(Pressione Enter para continuar.)");
        scanner.nextLine();
    }

    public static void listarFuncionarios(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
        }
        else {
            for (Funcionario f : funcionarios) {
                System.out.println(f.exibirDados());
            }
        }
        System.out.println("(Pressione Enter para continuar.)");
        scanner.nextLine();
    }

    public static void listarGerentes(Scanner scanner, ArrayList<Gerente> gerentes) {
        if (gerentes.isEmpty()) {
            System.out.println("Não há gerentes cadastrados.");

        }
        else {
            for (Gerente g : gerentes) {
                System.out.println(g.exibirDados());
            }
        }
        System.out.println("(Pressione Enter para continuar.)");
        scanner.nextLine();
    }
}
