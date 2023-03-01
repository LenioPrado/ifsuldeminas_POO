package br.edu.ifsuldeminas.financeiro;

import br.edu.ifsuldeminas.geometria.Geometria;

public class Pagamentos extends Geometria{
    
    private int numero;

    public Pagamentos(int valor){
        numero = valor;
        // Mais alguma coisa
        // outra coisa
        // 3
        // 4
        // 5
    }

    public int getNumero() {
        return numero;
    }

    public Pagamentos(){
        this(100);
    }

    public void teste(){
        Geometria g = new Geometria();
        //g.auxiliar();
        g.calcularArea();
    }

    @Override
    public float calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
}
