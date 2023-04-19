package ListImplement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {

    private int tamanhoPadrao = 2;
    private int tamanhoExpansao = 4;
    private int totalElementos = 0;

    private T[] lista;

    @SuppressWarnings("unchecked")
    public Lista() {
        lista = (T[])Array.newInstance(Object.class, tamanhoPadrao);
    }

    private int obterPosicaoLivre() {
        int livre = -1;
        for (int indice = 0; indice < lista.length; indice++) {
            if (lista[indice] == null)
                return indice;
        }

        return livre;
    }

    //@SuppressWarnings("unchecked")
    public void adicionar(T elemento) {
        int indiceLivre = obterPosicaoLivre();
        if (indiceLivre < 0) {
            int tamanhoAtual = lista.length;
            int novoTamanho = lista.length + tamanhoExpansao;
            //T[] nova = new T[novoTamanho];            
            //T[] nova = (T[])Array.newInstance(elemento.getClass(), novoTamanho);
            T[] nova = Arrays.copyOf(lista, novoTamanho);
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

    public boolean contem(T elemento){
        int posicao = indiceDe(elemento);
        return posicao >= 0;
    }

    public boolean remove(T elemento){
        for (int index = 0; index < totalElementos; index++) {
            if (lista[index].equals(elemento)) {                
                lista[index] = null;
                return true;
            }
        }
        return false;
    }

    public T remove(int posicao) {
        T elemento = obter(posicao);
        if (posicao == lista.length - 1) {
            lista[posicao] = null;
        } else if(posicao < 0 || posicao >= lista.length) {
            throw new IndexOutOfBoundsException("Posição inexistente!");
        } else {
            System.arraycopy(lista, posicao + 1, lista, posicao, totalElementos - posicao - 1);
            lista[totalElementos - 1] = null;
        }

        totalElementos--;
        listar();
        return elemento;
    }

    public void listar() {
        String result = "";
        for (int i = 0; i < totalElementos; i++) {
            result += lista[i];
            if (i != lista.length - 1) {
                result += ", ";
            }
        }
        if(result != "")
            System.out.println(result);
    }

    public int indiceDe(T elemento){
        for (int index = 0; index < totalElementos; index++) {
            if(lista[index].equals(elemento)){
                return index;
            }
        }
        return -1;
    }

    public T obter(int posicao) throws IndexOutOfBoundsException {
        if (posicao <0 || posicao >= lista.length) {
            throw new IndexOutOfBoundsException("Posição inexistente!");
        }

        T elemento = lista[posicao];
        return elemento;
    }
}
