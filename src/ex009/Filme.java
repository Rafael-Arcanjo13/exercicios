package ex009;

import java.util.ArrayList;
import java.util.Collections;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private double nota;

    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<>();
        filmes.add("Perseguição");
        filmes.add("Assassinato");
        filmes.add("Justiça");
        filmes.add("Rambo");

        Collections.sort(filmes);
        System.out.println(filmes);


    }
}
