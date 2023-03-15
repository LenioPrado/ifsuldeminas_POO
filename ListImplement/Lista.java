package ListImplement;

import Pizza.PizzariaFranqueados.Pizzaria;

public class Lista {

    private String[] lista;    

    public Lista(int tamanho){
        lista = new String[tamanho];
    }

    private int obterPosicaoLivre(){
        int livre = -1;
        for(int indice=0; indice < lista.length; indice++){
            if(lista[indice] == null)
                return indice;
        }

        return livre;
    }

    public void adicionar(String elemento){
        int indiceLivre = obterPosicaoLivre();
        if(indiceLivre < 0){
            System.out.println("Lista Cheia!");
            return;
        }
        
        lista[indiceLivre] = elemento;        
    }

    public int contar(){
        int contagem = 0;
        
        for(int indice=0; indice < lista.length; indice++){
            if(lista[indice] != null )
                contagem++;
        }

        return contagem;
    }

    public String remove(int posicao){
        String elemento = obter(posicao);
        if(elemento != null)
            lista[posicao] = null;
        else
            System.out.println("Posicao Inexistente!");

        return elemento;
    }

    public String obter(int posicao){
        if(posicao >= lista.length){
            System.out.println("Posicao Inexistente!");
            return null;
        }

        String elemento = lista[posicao];        
        return elemento;
    }
}
