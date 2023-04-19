import ListImplement.ILista;

public class ImpLista implements ILista {

    private static int tamanhoInicial = 10;
    private static int tamanhoIncremento = 4;
    private int tamanho;
    private String[] lista;
    private int contagem = 0;

    public ImpLista() {
        this.tamanho = tamanho;
        lista = new String[tamanhoInicial];
    }

    @Override
    public void adicionar(Object elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public int contar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contar'");
    }

    @Override
    public boolean contem(Object elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contem'");
    }

    @Override
    public boolean remove(Object elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Object remove(int posicao) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public int indiceDe(Object elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indiceDe'");
    }

    @Override
    public Object obter(int posicao) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obter'");
    }
    
}
