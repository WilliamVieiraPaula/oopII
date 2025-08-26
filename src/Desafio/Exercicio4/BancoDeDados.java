package Desafio.Exercicio4;

public class BancoDeDados implements Armazenamento {
    private String dado;

    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("Salvo no banco de dados.");
    }

    public String ler() {
        return "BD: " + dado;
    }
}
