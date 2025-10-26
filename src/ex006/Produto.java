package ex006;

import java.util.ArrayList;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Valor: " + this.preco + " | Quantidade: " + this.quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Sabão", 18.6, 2);
        produtos.add(p1);

        System.out.println(produtos.getFirst());
    }
}
