package Desafio.Exercicio4;

public class ArquivoTexto  implements Armazenamento {
    private String dado;

    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("Salvo no arquivo texto.");
    }

    public String ler() {
        return "Arquivo: " + dado;
    }
}
