package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class PocosCaldas extends Pizzaria {
    
    @Override
    protected List<String> obterIngredientes() {
        List<String> ingredientes = getIngredientes();
       
        ingredientes.add("Presunto");
        ingredientes.add("Queijo");
        return ingredientes;
    }

    @Override
    protected int obterTempoDeForno() {
        return 30;        
    }
    
}
