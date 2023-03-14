package Pizza.PizzariaFiles;

import java.util.ArrayList;
import java.util.List;

import Pizza.PizzariaFranqueados.*;

public class MainPizzaria {
    
    public static void main(String[] args){

        Caldas caldas = new Caldas();
        PocosCaldas pocos = new PocosCaldas();
        Botelhos botelhos = new Botelhos();

        System.out.println("Processando Caldas");
        caldas.realizarProcesso();
        
        System.out.println("Processando PocosCaldas");
        pocos.realizarProcesso();        

        System.out.println("Processando Botelhos");
        botelhos.realizarProcesso();
    }
}
