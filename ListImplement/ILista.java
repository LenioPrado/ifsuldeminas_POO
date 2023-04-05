package ListImplement;

public interface ILista<T> {

    public void adicionar(T elemento);

    public int contar();

    public boolean contem(T elemento);

    public boolean remove(T elemento);

    public T remove(int posicao) throws IndexOutOfBoundsException;

    public void listar();

    public int indiceDe(T elemento);

    public T obter(int posicao) throws IndexOutOfBoundsException;
}

