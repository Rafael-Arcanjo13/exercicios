package ex013;

import java.io.FileWriter;
import java.io.IOException;

public class Titulo {

    public static void main(String[] args) throws IOException {
        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo");
        escrita.close();
    }
}
