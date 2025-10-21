package ex004;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("-----------------------------");
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Este livro já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido! Agora está disponível novamente.");
    }
}
