package ex004;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Alessandro Vilas Boas", "O Sol Brilha Mais Forte Agora", 2016);
        Livro livro2 = new Livro("J. K. Rowling", "Harry Potter e a Pedra Filosofal", 1997);
        Livro livro3 = new Livro("George Orwell", "1984", 1949);

        livro2.emprestar();
        livro2.emprestar();
        livro2.devolver();

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
    }
}
