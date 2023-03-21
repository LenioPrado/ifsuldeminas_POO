package Abstratas;

import java.util.ArrayList;
import java.util.List;

public abstract class ClasseAbstrata {
    
    List<String> lista = new ArrayList<String>();
    
    public void metodo(){
        System.out.println("Ola sou um metodo");
    }

    public abstract void semCorpo();
}
