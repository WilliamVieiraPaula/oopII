package DesafioSolid;

public class EnvioCorreios implements MetodoEnvio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido '" + pedido.getProduto() + "' enviado pelos Correios.");
    }
}
