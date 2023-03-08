package ListImplement;

public class MainLista {

    public static void main(String[] args){
        int tamanho = 2;
        Lista lista = new Lista(tamanho);
        System.out.println("Tamanho da lista: " + lista.contar());
        lista.adicionar("A");
        System.out.println("Tamanho da lista: " + lista.contar());
        lista.adicionar("B");

        int posicao = 1;
        String elemento = lista.obter(posicao);
        System.out.printf("Elemento posicao %d: %s\n", posicao, elemento);
        elemento = lista.remove(posicao);
        System.out.printf("Elemento removido da posicao %d: %s\n", posicao, elemento);
        System.out.println("Tamanho da lista: " + lista.contar());
    }

}
