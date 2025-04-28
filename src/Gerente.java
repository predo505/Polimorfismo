public class Gerente extends Funcionario {

    private double bonusExtra;

    public Gerente() {
        super();
        this.bonusExtra = 0.0;
    }

    public Gerente(String nome, double salario, double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }

    @Override
    public double calcularBonus() {
        return (super.calcularBonus() + bonusExtra);
    }

    @Override
    public String exibirDados() {
        return "Gerente - Nome: " + getNome() + " - Salário: " + getSalario() + " - Bônus: " + calcularBonus();
    }
}
