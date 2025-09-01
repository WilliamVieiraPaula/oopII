package DesafioSolid;

class EnvioMotoboy implements MetodoEnvio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido '" + pedido.getProduto() + "' entregue via Motoboy.");
    }
}
