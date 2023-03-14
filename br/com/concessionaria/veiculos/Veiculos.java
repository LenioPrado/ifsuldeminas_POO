package br.com.concessionaria.veiculos;

import br.com.concessionaria.funcionarios.Mecanico;

public class Veiculos {
    private String placa;
    private int ano;
    private int modelo;
    private String numeroChassi;
    private String cor;
    private int kmRodados;

    public Veiculos(String placa, int ano, int modelo, String numeroChassi, String cor, int kmRodados) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.numeroChassi = numeroChassi;
        this.cor = cor;
        this.kmRodados = kmRodados;
    }

    public void informarQuilometragem(int quilometragem){
        this.kmRodados = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }
   
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getNumeroChassi() {
        return numeroChassi;
    }
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getKmRodados() {
        return kmRodados;
    }
    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }
}
