package Desafio.Exercicio3;

public class CartaoCredito  implements Pagamento {


    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Pagamento no cartão: R$ " + valor);
            gerarRecibo(valor);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }
}
