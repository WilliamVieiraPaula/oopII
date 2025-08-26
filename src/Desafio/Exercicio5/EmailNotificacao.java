package Desafio.Exercicio5;

public class EmailNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}
