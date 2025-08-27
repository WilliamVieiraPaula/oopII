package DesafioGenerics;

public class Main {
    public static void main(String[] args) {
        RepositorioProduto repoProdutos = new RepositorioProduto();
        repoProdutos.salvar(new Produto(1, "Notebook", 3500.0));
        repoProdutos.salvar(new Produto(2, "Mouse", 50.0));

        System.out.println("Produtos:");
        for (Produto p : repoProdutos.listarTodos()) {
            System.out.println(p);
        }

        RepositorioCliente repoClientes = new RepositorioCliente();
        repoClientes.salvar(new Cliente(1, "Maria", "maria@email.com"));
        repoClientes.salvar(new Cliente(2, "João", "joao@email.com"));

        System.out.println("\nClientes:");
        for (Cliente c : repoClientes.listarTodos()) {
            System.out.println(c);
        }

        System.out.println("\nBuscar cliente com ID 1:");
        System.out.println(repoClientes.buscarPorId(1));
    }
}
