package ex007;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario("Rafael", 1732.00, "Desenvolvedor");
        Funcionario f2 = new Funcionario("Gabriela", 2000.00, "Administradora");
        Gerente g1 = new Gerente("Godofredo", 5000.00, "Ceo", 1000.00);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(g1);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    }
}
