package br.edu.ifsuldeminas.financeiro;

import br.edu.ifsuldeminas.geometria.Geometria;
import br.edu.ifsuldeminas.geometria.Losango;

public class Pagamentos extends Geometria{
    
    private int numero;

    public Pagamentos(int valor){
        numero = valor;        
    }

    public int getNumero() {
        return numero;
    }

    public Pagamentos(){
        this(100);
    }

    public void instanciar(){
        Geometria losango = new Losango();
        losango.auxiliar();
        losango.calcularArea();
    }

    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
}
