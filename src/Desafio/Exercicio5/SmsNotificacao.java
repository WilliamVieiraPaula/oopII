package Desafio.Exercicio5;

public class SmsNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
