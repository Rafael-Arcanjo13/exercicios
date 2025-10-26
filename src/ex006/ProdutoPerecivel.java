package ex006;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " | Validade: " + this.dataValidade;
    }

    public static void main(String[] args) {
        ArrayList<ProdutoPerecivel> pereciveis= new ArrayList<>();

        ProdutoPerecivel pp1 = new ProdutoPerecivel("Bife", 50.00, 6, LocalDate.of(2025, Month.of(11), 12));
        pereciveis.add(pp1);

        System.out.println(pereciveis.get(0));

    }

}
