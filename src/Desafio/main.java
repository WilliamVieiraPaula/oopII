package Desafio;
import Desafio.Exercicio1.Animal;
import Desafio.Exercicio1.Cachorro;
import Desafio.Exercicio1.Gato;
import Desafio.Exercicio2.Calculadora;
import Desafio.Exercicio3.CartaoCredito;
import Desafio.Exercicio3.Pagamento;
import Desafio.Exercicio3.Pix;
import Desafio.Exercicio4.Armazenamento;
import Desafio.Exercicio4.ArquivoTexto;
import Desafio.Exercicio4.BancoDeDados;
import Desafio.Exercicio5.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            // Ex 1
            Animal cachorro = new Cachorro();
            Animal gato = new Gato();
            cachorro.emitirSom();
            gato.emitirSom();

            // Ex 2
            Calculadora calc = new Calculadora();
            System.out.println("Soma: " + calc.somar(10, 5));

            // Ex 3
            Pagamento pagamento1 = new CartaoCredito();
            pagamento1.processarPagamento(100);

            Pagamento pagamento2 = new Pix();
            pagamento2.processarPagamento(200);

            // Ex 4
            List<Armazenamento> armazenamentos = new ArrayList<>();
            armazenamentos.add(new BancoDeDados());
            armazenamentos.add(new ArquivoTexto());

            for (Armazenamento ar : armazenamentos) {
                ar.salvar("Teste de dado");
                System.out.println(ar.ler());
            }


            // Ex 5
            Scanner scanner = new Scanner(System.in);
            List<Notificacao> canais = new ArrayList<>();

            System.out.println("Escolha canais de notificação (email, sms, push): ");
            String entrada = scanner.nextLine();
            if (entrada.contains("email")) canais.add(new EmailNotificacao());
            if (entrada.contains("sms")) canais.add(new SmsNotificacao());
            if (entrada.contains("push")) canais.add(new PushNotificacao());

            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canais);
            gerenciador.notificarTodos("Olá, essa é uma notificação!");

            scanner.close();
        }
}
