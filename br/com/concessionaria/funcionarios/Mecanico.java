package br.com.concessionaria.funcionarios;

public class Mecanico {
    private String nome;
    private int anosExperiencia;
    private int carrosSimultaneos;
    
    public Mecanico(String nome, int anosExperiencia, int carrosSimultaneos) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.carrosSimultaneos = carrosSimultaneos;
    }

    @Override
    public boolean equals(Object obj) {
        // if(obj == null){
        //     return false;
        // } else if(!(obj instanceof Mecanico)){
        //     return false;
        // }

        if(obj instanceof Mecanico){
            Mecanico outro = (Mecanico)obj;
            return this.nome.equals(outro.getNome());            
        }
        
        return false;
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public int getCarrosSimultaneos() {
        return carrosSimultaneos;
    }
    public void setCarrosSimultaneos(int carrosSimultaneos) {
        this.carrosSimultaneos = carrosSimultaneos;
    }
}
