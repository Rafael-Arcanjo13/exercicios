package ex005;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Meu nome é: " + this.nome + " e eu tenho " + this.idade + " anos";
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> nomes = new ArrayList<>();

        Pessoa p1 = new Pessoa("Rafa", 19);
        Pessoa p2 = new Pessoa("Gaba", 21);
        Pessoa p3 = new Pessoa("Gab", 20);

        nomes.add(p1);
        nomes.add(p2);
        nomes.add(p3);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
