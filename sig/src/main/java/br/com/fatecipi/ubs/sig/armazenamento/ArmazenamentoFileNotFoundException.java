package br.com.fatecipi.ubs.sig.armazenamento;

public class ArmazenamentoFileNotFoundException extends ArmazenamentoException {

    private static final long serialVersionUID = 1L;

    public ArmazenamentoFileNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ArmazenamentoFileNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
    
}