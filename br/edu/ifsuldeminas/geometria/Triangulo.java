package br.edu.ifsuldeminas.geometria;

public class Triangulo extends Geometria {
    
    public void calculoTriangulo(){
        System.out.println("Calculo da area do triangulo 130");
    }

    @Override
    public float calcularArea() {
        System.out.println("A área do triangulo é 100");
        return 100;
    }    
}
