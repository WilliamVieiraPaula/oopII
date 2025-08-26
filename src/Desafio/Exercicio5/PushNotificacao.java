package Desafio.Exercicio5;

public class PushNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Push: " + mensagem);
    }
}
