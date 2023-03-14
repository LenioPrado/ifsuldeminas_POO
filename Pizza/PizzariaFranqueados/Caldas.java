package Pizza.PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class Caldas extends Pizzaria {
    
    @Override
    protected List<String> obterIngredientes() {
        List<String> ingredientes = getIngredientes();        
        ingredientes.add("Tomate");
        ingredientes.add("Água");
        return ingredientes;
    }

    @Override
    protected int obterTempoDeForno() {
        return 60;        
    }
}
