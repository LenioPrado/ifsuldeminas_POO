package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class PocosCaldas extends Pizzaria {
    
    @Override
    protected List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Farinha");
        ingredientes.add("Ovo");
        ingredientes.add("Presunto");
        ingredientes.add("Queijo");
        return ingredientes;
    }

    @Override
    protected int obterTempoDeForno() {
        return 30;        
    }
    
}
