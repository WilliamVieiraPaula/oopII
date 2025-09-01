package DesafioSolid;

public class LojaOnline {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Coca-Cola 2L", 9.99);

        MetodoPagamento pagamento = new PagamentoPix();
        MetodoEnvio envio = new EnvioMotoboy();
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos(pagamento, envio);
        gerenciador.processarPedido(pedido);
    }
}
