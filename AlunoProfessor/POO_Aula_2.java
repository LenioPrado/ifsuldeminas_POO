package AlunoProfessor;
//import Aluno;

public class POO_Aula_2{
    public static void main(String[] args){
        if(args.length > 0){            
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            String msg = 
                String.format("A soma dos números %s e %s é %d", 
                args[0], args[1], num1 + num2);
            System.out.println(msg);
        }
        Aluno a1 = new Aluno();
        a1.nome = "Aluno 1";

        Aluno a2 = new Aluno();
        a2.nome = "Aluno 2";

        Aluno a3 = a2;
        a3.nome = "Aluno 3";

        boolean result = a1 == a2;
        System.out.println("Aluno 1: " + a1 + " Nome: " + a1.nome);
        System.out.println("Aluno 2: " + a2 + " Nome: " + a2.nome);
        System.out.println("Aluno 3: " + a3 + " Nome: " + a3.nome);
        System.out.println("São Iguais? " + result);

        int soma = 200;
        Soma(soma);

        System.out.println("A soma é: " + soma);
        

        System.out.println("Nome do aluno 1: " + a1.nome);
        a1.p = new Professor();
        AlteraAluno(a1);
        System.out.println("Aluno 1: " + a1);
        System.out.println("Professor do aluno 1: " + a1.p);
    }

    public static int Soma(int soma){
        soma = 100;
        return soma;
    }

    public static Aluno AlteraAluno(Aluno aluno){
        aluno.nome = "Alterado";
        aluno.p = null;
        return aluno;
    }
}