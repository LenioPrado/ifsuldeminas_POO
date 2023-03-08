package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public class Botelhos extends Pizzaria {

    @Override
    protected List<String> obterIngredientes() {
        List<String> ing = new ArrayList<String>();
        ing.add("Molho");
        return ing;
    }

    @Override
    protected int obterTempoDeForno() {
        return 15;
    }
    
}
