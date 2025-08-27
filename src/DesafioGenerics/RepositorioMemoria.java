package DesafioGenerics;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {
    protected List<T> dados = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        dados.add(obj);
    }

    @Override
    public List<T> listarTodos() {
        return dados;
    }
}