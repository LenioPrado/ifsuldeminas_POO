package PizzariaFranqueados;

import java.util.List;

public abstract class Pizzaria {

    protected abstract List<String> obterIngredientes();

    protected abstract int obterTempoDeForno();

    public void realizarProcesso(){
        List<String> ingredientes = obterIngredientes();
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