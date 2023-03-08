package PizzariaFranqueados;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizzaria {

    private List<String> ingredientes;
    
    public Pizzaria(){
        ingredientes = new ArrayList<String>();
        setIngredientesBase();
    }

    private void setIngredientesBase(){
        ingredientes.add("Farinha");
        ingredientes.add("Ovo");
        ingredientes.add("Cebola");
        ingredientes.add("Leite");
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    private void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    protected abstract List<String> obterIngredientes();

    protected abstract int obterTempoDeForno();

    public void realizarProcesso(){
        setIngredientes(obterIngredientes());

        misturarIngredientes(ingredientes);
        int tempoForno = obterTempoDeForno();
        assar(tempoForno);
    }

    protected void misturarIngredientes(List<String> ingredientes){
        System.out.println("Misturando os ingredientes:");
        
        for (String ingrediente : ingredientes) {
            System.out.printf("%s\n", ingrediente);
        }
        System.out.println("\n");
    }    

    protected void assar(int tempo){
        System.out.printf("Assando a pizza por %d minutos.\n", tempo);
    }
}