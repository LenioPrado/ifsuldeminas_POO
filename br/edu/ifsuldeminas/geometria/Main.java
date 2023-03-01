package Geometria;

import Pessoa.*;

public class Main {

    public static void main(String args[]){
        Pessoa p;

        Geometria geometria = new Geometria();
        geometria.calcularArea();

        Triangulo triangulo = new Triangulo();
        triangulo.calcularArea();

        Quadrado quadrado = new Quadrado();
        quadrado.calcularArea();
    }
}
