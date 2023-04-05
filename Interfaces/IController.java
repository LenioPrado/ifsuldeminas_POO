import java.util.Collection;

public interface IController<TEntity, TId> {    
    
    public String GetAll();

    public String GetById(TId id);

    public TEntity GetEntityById(TId id);

    public TEntity Post(TEntity entity);

    public TEntity Put(TEntity entity);

    public Collection<TEntity> PutAll(Collection<TEntity> entities);

    public String Delete(TId id) throws Exception;

    public void DeleteAll();
}
