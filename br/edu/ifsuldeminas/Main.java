package br.edu.ifsuldeminas;

import br.edu.ifsuldeminas.financeiro.Pagamentos;
import br.edu.ifsuldeminas.geometria.*;

public class Main {
    public static void main(String[] args) {
        // Pagamentos pag = new Pagamentos(10);
        // System.out.println("Numero com construtor: " + pag.getNumero());
        // pag = new Pagamentos();
        // System.out.println("Numero sem construtor: " + pag.getNumero());
        
        Triangulo triangulo = new Triangulo();
        //triangulo.calculoTriangulo();

        Quadrado quadrado = new Quadrado();
        //quadrado.calcularAreaQuadrado();

        Losango losango = new Losango();

        exibeResultado(triangulo);
        exibeResultado(quadrado);
        exibeResultado(losango);
    }

    public static void exibeResultado(Geometria geometria){
        geometria.calcularArea();
    }
}
