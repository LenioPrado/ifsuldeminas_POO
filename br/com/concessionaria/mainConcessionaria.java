package br.com.concessionaria;

import java.util.ArrayList;
import java.util.List;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculos;

public class mainConcessionaria {

    public static boolean verifica(Mecanico m1, Mecanico m2){
        return m1.equals(m2);
    }

    public static void main(String[] args){

        Oficina oficina = new Oficina("Oficina POO");
        
        Mecanico mecanico1 = new Mecanico("Pedro", 10, 2);
        Mecanico mecanico2 = new Mecanico("Pedro", 12, 6);

        Peca peca1 = new Peca("Peça 1", 15f);
        Peca peca2 = new Peca("Peça 2", 25f);
        Peca peca3 = new Peca("Peça 3", 35f);
        Peca peca4 = new Peca("Peça 4", 45f);

        Veiculos veiculo1 = new Veiculos
        ("A", 2020, 2021, "Chassi1", "Verde", 1000);
        Veiculos veiculo2 = new Veiculos
        ("B", 2022, 2023, "Chassi2", "Amarelo", 2000);

        oficina.adicionarVeiculo(veiculo1);
        oficina.adicionarVeiculo(veiculo2);
        
        oficina.adicionarPeca(peca1);
        oficina.adicionarPeca(peca2);
        oficina.adicionarPeca(peca3);
        oficina.adicionarPeca(peca4);

        oficina.adicionarMecanico(mecanico1);
        oficina.adicionarMecanico(mecanico2);

        oficina.verificarPecasRevisao();
        oficina.realizarRevisaoVeiculos();        
    }
    
}
