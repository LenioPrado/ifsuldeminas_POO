package ListImplement;

public class MainLista {

    public static void main(String[] args){
       arrayMethod();
    }

    public static void arrayMethod(){

        Lista lista = new Lista();
        System.out.println("Tamanho da lista: " + lista.contar());
        lista.adicionar("A");
        System.out.println("Tamanho da lista: " + lista.contar());
        lista.adicionar("B");

        int posicao = 10;
        String elemento = null;
        try {
            elemento = lista.obter(posicao);        
        }catch (IndexOutOfBoundsException e) {            
            e.printStackTrace();
            System.out.println("Acessou posição inválida!");
        }      

        System.out.printf("Elemento posicao %d: %s\n", posicao, elemento);        
        System.out.println("Tamanho da lista: " + lista.contar());
        
        lista.adicionar("C");
        lista.adicionar("D");

        elemento = lista.remove(0);
        elemento = lista.remove(2);
        elemento = lista.remove(1);
        elemento = lista.remove(0);
    }

    public static void listaDinamica(){
        String[] arr1 = new String[5];
        arr1[0] = "A";
        arr1[1] = "B";
        arr1[2] = "C";
        arr1[3] = "D";
        arr1[4] = "E";

        String[] arr2 = new String[5];
        //arr2 = Arrays.copyOf(arr1, arr1.length);

        int src = 2, dst = 1;

        System.arraycopy(arr1, src, arr1, dst, arr1.length - dst - 1);
        arr1[arr1.length - 1] = null;

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < arr1.length; i++) {
            str1 += arr1[i] + ",";
            str2 += arr2[i] + ",";
        }
        System.out.println("Arr 1: " + str1);
        System.out.println("Arr 2: " + str2);
    }

}
