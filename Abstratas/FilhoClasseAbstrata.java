package Abstratas;

public class FilhoClasseAbstrata extends ClasseAbstrata {
    
    public FilhoClasseAbstrata() {
        metodo();
    }

    @Override
    public void semCorpo() {
        System.out.println("Filho Classe Abstrata");
    }
}
