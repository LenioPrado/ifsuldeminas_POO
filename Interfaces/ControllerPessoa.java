import java.util.Collection;
import java.util.Map;

public class ControllerPessoa implements IController<Pessoa, Integer> {

    private IRepository repository;

    public ControllerPessoa(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public String GetAll() {
        repository.GetAll();
        throw new UnsupportedOperationException("Unimplemented method 'GetAll'");
    }

    @Override
    public String GetById(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'GetById'");
    }

    @Override
    public Pessoa GetEntityById(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'GetEntityById'");
    }

    @Override
    public Pessoa Post(Pessoa entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'Post'");
    }

    @Override
    public Pessoa Put(Pessoa entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'Put'");
    }

    @Override
    public Collection<Pessoa> PutAll(Collection<Pessoa> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'PutAll'");
    }

    @Override
    public String Delete(Integer id) throws Exception {
       
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

    @Override
    public void DeleteAll() {
       
        throw new UnsupportedOperationException("Unimplemented method 'DeleteAll'");
    }
    
}
