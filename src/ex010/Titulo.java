package ex010;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public Titulo(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Sobrenome: " + this.sobrenome;
    }

    public static void main(String[] args) {
        List<Titulo> lista = new LinkedList<>();
        //lista.add(1);
       // lista.add(6);
        //lista.add(4);
       // lista.add(2);
        Collections.sort(lista);

        System.out.println(lista);

        Titulo nome1 = new Titulo("Rafael", "Arcanjo");
        Titulo nome2 = new Titulo("Gabriela", "Alice");
        Titulo nome3 = new Titulo("Gabriel", "Arcanjo");
        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);

        Collections.sort(lista);

        System.out.println(lista);


    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
