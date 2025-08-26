package Desafio.Exercicio3;

public interface Pagamento {
    void processarPagamento(double valor);

    default void gerarRecibo(double valor) {
        System.out.println("Recibo gerado: R$ " + valor);
    }

    static boolean validarValor(double valor) {
        return valor > 0;
    }
}
