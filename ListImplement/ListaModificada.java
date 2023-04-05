package ListImplement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaModificada<T> {

    private int tamanhoPadrao = 2;
    private int tamanhoExpansao = 4;
    private int totalElementos = 0;

    private T[] lista;

    @SuppressWarnings("unchecked")
    public ListaModificada() {
        lista = (T[]) Array.newInstance(Object.class, tamanhoPadrao);
    }

    private int obterPosicaoLivre() {
        int livre = -1;
        for (int indice = 0; indice < lista.length; indice++) {
            if (lista[indice] == null)
                return indice;
        }

        return livre;
    }

    public void adicionar(T elemento) {
        int indiceLivre = obterPosicaoLivre();
        if (indiceLivre < 0) {
            int tamanhoAtual = lista.length;
            T[] nova = Arrays.copyOf(lista, lista.length + tamanhoExpansao);
            System.arraycopy(lista, 0, nova, 0, tamanhoAtual);
            indiceLivre = tamanhoAtual;
            lista = nova;
        }

        lista[indiceLivre] = elemento;
        totalElementos++;

        listar();
    }

    public int contar() {
        int contagem = 0;

        for (int indice = 0; indice < lista.length; indice++) {
            if (lista[indice] != null)
                contagem++;
        }

        return contagem;
    }

    public T remove(int posicao) {
        T elemento = obter(posicao);
        if (posicao == lista.length - 1) {
            lista[posicao] = null;
        } else {
            System.arraycopy(lista, posicao + 1, lista, posicao, totalElementos - posicao);
            lista[totalElementos] = null;
        }

        totalElementos--;
        listar();
        return elemento;
    }

    public void listar() {
        String result = "";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                result += lista[i].toString();
                if (i != lista.length - 1) {
                    result += ", ";
                }
            }
        }
        System.out.println(result);
    }

    public T obter(int posicao) throws IndexOutOfBoundsException {
        if (posicao >= lista.length) {
            throw new IndexOutOfBoundsException("Posição inexistente!");
        }

        T elemento = lista[posicao];
        return elemento;
    }
}
