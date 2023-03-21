package Abstratas;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public class MainClasseAbstrata {
    public static void main(String args[]){
        FilhoClasseAbstrata fca = new FilhoClasseAbstrata();
        fca.semCorpo();

        OutroFilhoAbstrato ofa = new OutroFilhoAbstrato();
        ofa.semCorpo();

        AlgumaColecao colecao = new AlgumaColecao(); 
        AlgumaLista lista = new AlgumaLista(); 
        
        MainClasseAbstrata mca = new MainClasseAbstrata();
        
        HashSet  q = new HashSet ();
        HashMap  h = new HashMap ();

        //mca.metodoLista(colecao);
        mca.metodoLista(lista);

        mca.metodoColecao(colecao);
        mca.metodoColecao(lista);
    }

    public void metodoLista(List lista){

    }

    public void metodoColecao(Collection colecao){

    }
}
