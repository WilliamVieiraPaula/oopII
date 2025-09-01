package DesafioSolid;

public class GerenciadorDePedidos {
    private MetodoPagamento metodoPagamento;
    private MetodoEnvio metodoEnvio;

    // DIP: recebendo abstrações no construtor
    public GerenciadorDePedidos(MetodoPagamento metodoPagamento, MetodoEnvio metodoEnvio) {
        this.metodoPagamento = metodoPagamento;
        this.metodoEnvio = metodoEnvio;
    }

    public void processarPedido(Pedido pedido) {
        metodoPagamento.pagar(pedido.getValor());
        metodoEnvio.enviar(pedido);
    }
}
