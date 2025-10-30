package ex008;

import java.util.ArrayList;
import java.util.Collections;

public class Animal {
    public static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Abacate");
        lista.add("Zebra");
        lista.add("Mamão");
        Collections.sort(lista);

        for (String item : lista) {
            System.out.println(lista);
        }
    }
}
