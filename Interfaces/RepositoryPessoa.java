import java.util.Collection;

public class RepositoryPessoa implements IRepository<Pessoa, Integer> {

    @Override
    public Pessoa Add(Pessoa entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'Add'");
    }

    @Override
    public void AddRange(Collection<Pessoa> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'AddRange'");
    }

    @Override
    public Pessoa Remove(Pessoa entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'Remove'");
    }

    @Override
    public void RemoveRange(Collection<Pessoa> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'RemoveRange'");
    }

    @Override
    public Pessoa Update(Pessoa entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public void UpdateRange(Collection<Pessoa> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'UpdateRange'");
    }

    @Override
    public Collection<Pessoa> GetAll() {
       
        throw new UnsupportedOperationException("Unimplemented method 'GetAll'");
    }

    @Override
    public Pessoa GetById(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'GetById'");
    }

    @Override
    public void ExecuteQuery(String command) {
       
        throw new UnsupportedOperationException("Unimplemented method 'ExecuteQuery'");
    }

    @Override
    public int SaveChanges() {
       
        throw new UnsupportedOperationException("Unimplemented method 'SaveChanges'");
    }
    
}
