package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class Botelhos extends Pizzaria {

    public void MetodoBotelhos(){

    }

    @Override
    protected List<String> obterIngredientes() {
        List<String> ing = getIngredientes();
        ing.add("Azeitona");
        return ing;
    }

    @Override
    protected int obterTempoDeForno() {
        return 15;
    }
    
}
