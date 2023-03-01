import Operacoes.Operacoes;

public class Main {

    public static void main(String args[]){
        Operacoes operacoes = new Operacoes();
        operacoes.setNumero1(10);
        operacoes.setNumero2(20);

        int soma = operacoes.soma();
        System.out.println("A soma é: " + soma);
    }
}
