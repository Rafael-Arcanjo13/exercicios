package ex012;

import java.util.Scanner;

public class Senha {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public static void main(String[] args) throws ErroDeTamanhoDeSenha {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = leitura.nextLine();

        try {
            if (senha.length() < 8) {
                throw new ErroDeTamanhoDeSenha("A senha deve conter no minimo 8 caracteres");
            }

            System.out.println("Senha válida!");
        } catch (ErroDeTamanhoDeSenha e) {
            System.out.println(e.getMessage());
        }

    }
}
