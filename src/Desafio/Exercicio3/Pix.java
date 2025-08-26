package Desafio.Exercicio3;

public class Pix implements Pagamento {
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Pagamento via Pix: R$ " + valor);
            gerarRecibo(valor);
        }
    }
}