package ex014;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    private String nome;
    private String sobrenome;

    public Titulo(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + this.sobrenome;
    }

    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Titulo t1 = new Titulo("Rafael", "Arcanjo");

        FileWriter escrita = new FileWriter("titulo.json");
        escrita.write(gson.toJson(t1));
        escrita.close();

        System.out.println(escrita);
    }
}
