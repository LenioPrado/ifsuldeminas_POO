package br.com.concessionaria.oficina;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculos;

public class Oficina {
    private String nomeOficina;
    private List<Mecanico> listaMecanicos;
    private List<Peca> listaPecas;
    private List<Veiculos> listaVeiculos;
    private int pecasNecessarias;

    public Oficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
        this.listaMecanicos = new ArrayList<Mecanico>();
    }

    public int verificarPecasRevisao(){
        if(listaVeiculos.size() == 0){
            System.out.println("Não há carros a serem revisados!");            
        } else {
            for(int cont = 0; cont < listaVeiculos.size(); cont ++){
                this.pecasNecessarias += new Random().nextInt(1, 4);
            }
            String msg = "São necessárias %d peças para revisar os %d veículos.\n";
            System.out.printf(msg, this.pecasNecessarias, listaVeiculos.size());            
        }
        return this.pecasNecessarias;
    }

    public void adicionarMecanico(Mecanico mecanico){
        if(mecanico != null && !this.listaMecanicos.contains(mecanico)){
            this.listaMecanicos.add(mecanico);
        }
    }

    public void removerMecanico(Mecanico mecanico){
        this.listaMecanicos.remove(mecanico);
    }

    public void adicionarPeca(Peca peca){
        if(peca != null && !this.listaPecas.contains(peca)){
            this.listaPecas.add(peca);
        }
    }

    public void removerPeca(Peca peca){
        this.listaPecas.remove(peca);
    }

    public void adicionarVeiculo(Veiculos veiculo){
        if(veiculo != null && !this.listaVeiculos.contains(veiculo)){
            this.listaVeiculos.add(veiculo);
        }
    }

    public void removerVeiculo(Veiculos veiculo){
        this.listaVeiculos.remove(veiculo);
    }

    public String getNomeOficina() {
        return nomeOficina;
    }
    public void setNomeOficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
    }
    public List<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }
    private void setListaMecanicos(List<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }
    public List<Peca> getListaPecas() {
        return listaPecas;
    }
    public void setListaPecas(List<Peca> listaPecas) {
        this.listaPecas = listaPecas;
    }
    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    public int getPecasNecessarias() {
        return pecasNecessarias;
    }
    public void setPecasNecessarias(int pecasNecessarias) {
        this.pecasNecessarias = pecasNecessarias;
    }
}
