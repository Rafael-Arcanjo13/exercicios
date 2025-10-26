package ex007;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Salário: " + this.salario + " | Cargo: " + this.cargo;
    }
}
