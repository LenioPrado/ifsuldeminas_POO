package Pessoa;

public class Main {

    public static void main(String args[]){       

        Pessoa p1 = new Pessoa();
        p1.setCpf("123");
        p1.setNome("João");

        Pessoa p2 = new Pessoa();
        p2.setCpf("123");
        p2.setNome("Jose");

        p2.naoAcessivel();

        boolean resultado = p1.equals(10);
        System.out.println("P1 e P2 são iguais? " + resultado);
    }
}
