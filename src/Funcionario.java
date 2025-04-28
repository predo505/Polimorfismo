import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
        this.nome = "Indefinido";
        this.salario = 0.0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }

    public String exibirDados() {
        return "Funcionário - Nome: " + nome + " - Salário: " + salario + " - Bônus: " + calcularBonus();
    }
}
