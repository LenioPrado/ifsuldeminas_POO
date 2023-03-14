package br.com.concessionaria;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;

public class mainConcessionaria {

    public static boolean verifica(Mecanico m1, Mecanico m2){
        return m1.equals(m2);
    }

    public static void main(String[] args){
        Oficina oficina = new Oficina("Oficina POO");
        Mecanico mecanico1 = new Mecanico("Pedro", 10, 2);
        Mecanico mecanico2 = new Mecanico("Pedro", 12, 6);
        
        verifica(mecanico1, null);

        oficina.adicionarMecanico(mecanico1);
        oficina.adicionarMecanico(mecanico2);

        oficina.removerMecanico(null);

        for (Mecanico mecanico : oficina.getListaMecanicos()) {
            System.out.printf(
                "Mecanico: %s\n" +  
                "Anos Experiência: %d\n" +
                "Carros Simultaneos: %d\n", 
                mecanico.getNome(),
                mecanico.getAnosExperiencia(),
                mecanico.getCarrosSimultaneos());
        }
    }
    
}
