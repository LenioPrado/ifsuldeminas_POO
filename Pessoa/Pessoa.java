package Pessoa;
public class Pessoa {
    private String cpf;
    private String nome;

    @Override
    public boolean equals(Object obj) {
        // if(!(obj instanceof Pessoa)){
        //     return false;
        // }
        
        Pessoa outra = (Pessoa)obj;
        return cpf.equals(outra.cpf);
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
