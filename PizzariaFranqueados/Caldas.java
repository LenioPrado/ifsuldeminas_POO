package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class Caldas extends Pizzaria {
    
    @Override
    protected List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Cebola");
        ingredientes.add("Tomate");
        ingredientes.add("Água");
        return ingredientes;
    }

    @Override
    protected int obterTempoDeForno() {
        return 60;        
    }
}
