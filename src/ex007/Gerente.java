package ex007;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, String cargo, double bonus) {
        super(nome, salario, cargo);

        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Bônus: " + this.bonus;
    }
}
