package ListaUnicamp;

public class Questao1 {

    private String matricula;
    private String nome;
    private double[] notas;

    private double notasProvas;
    private double notaTrabalho;
    private double media;

    private static double pesoProvas = 2.5;
    private static double pesoTrabalho = 2.0;
    private static double media_aprovacao = 6.0;

    public Questao1(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new double[3];
    }

    public void addNotasProvas(double nota1, double nota2){
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notasProvas = (nota1 + nota2) * pesoProvas;
    }

    public void addNotaTrabalho(double nota){
        this.notas[2] = nota;
        this.notaTrabalho = nota * pesoTrabalho;
    }

    public double media(){
        // cada prova tem peso 2,5 e o trabalho tem peso 2
        this.media = (this.notasProvas + this.notaTrabalho) / (pesoProvas + pesoTrabalho);
        return this.media;
    }

    public double vaiParaFinal(){
        if (this.media >= media_aprovacao  ) {
            return 0;
        } else {
            return media_aprovacao - this.media;
        }
    }

    public static void executar(){
       Questao1 questao1 = new Questao1("1234", "Lênio");
       questao1.addNotasProvas(1.5, 2.2);
       questao1.addNotaTrabalho(2.6);

       System.out.printf("Aluno '%s' e matrícula '%s' com nota '%.2f'. Nota necessária para final: %.2f",
                        questao1.getNome(), questao1.getMatricula(), questao1.media(), questao1.vaiParaFinal());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }
}
