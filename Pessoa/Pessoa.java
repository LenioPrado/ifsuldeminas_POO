package Pessoa;

public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pessoa)){
            return false;
        }
        
        Pessoa outra = (Pessoa)obj;
        return nome.equals(outra.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
}
