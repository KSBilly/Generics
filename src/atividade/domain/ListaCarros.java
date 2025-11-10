package atividade.domain;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T> {

    private List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public void listar() {
        for (T item : itens) {
            System.out.println(item);
        }
    }

}
