package ex012;

public class ErroDeTamanhoDeSenha extends Exception {
    private String mensagem;

    public ErroDeTamanhoDeSenha(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
