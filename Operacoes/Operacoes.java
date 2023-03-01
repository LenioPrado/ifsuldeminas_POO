package Operacoes;
public class Operacoes {

    private int numero1;
    private int numero2;

    public int soma(){
        return getNumero1() + getNumero2(); 
    }

    public int subtracao(){
        return getNumero1() - getNumero2();
    }

    public int multiplicacao(){
        return getNumero1() * getNumero2();
    }

    public float divisao(){
        return getNumero1() / getNumero2();
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public int getNumero1(){
        return this.numero1;
    }
}