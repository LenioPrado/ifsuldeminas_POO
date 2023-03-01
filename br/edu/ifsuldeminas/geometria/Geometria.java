package br.edu.ifsuldeminas.geometria;

public abstract class Geometria {
    
    public Geometria(){
        exibeMensagem();
        realizaPreCalculo();
    }

    private void exibeMensagem(){
        System.out.println("Mensagem");
    }

    private void realizaPreCalculo(){
        System.out.println("PreCalculo");
    }

    public abstract float calcularArea();

    public float calcularArea(String teste){
        return 0;
    }

    public float calcularArea(int numero){
        return 0;
    }

    private void calculoIntermediario(){

    }

    protected void auxiliar(){

    }
}