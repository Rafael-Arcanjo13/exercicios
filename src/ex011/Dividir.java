package ex011;

import java.util.Scanner;

public class Dividir {

    private int numero1;
    private int numero2;

    public Dividir(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double dividir() {
        if (numero1 == 0 || numero2 == 0) {
            throw new ArithmeticException("Erro: divisão por zero não é permitida!");
        }
        return (double) numero1 / numero2;
    }

    @Override
    public String toString() {
        return "Numeros: " + numero1 + " e " + numero2;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var numero1 = leitura.nextInt();

        System.out.println("Informe o segundo número: ");
        var numero2 = leitura.nextInt();

        try {
            Dividir operacao = new Dividir(numero1, numero2);
            System.out.println(operacao.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
