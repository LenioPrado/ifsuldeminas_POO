import java.util.Collection;

public interface IRepository<TEntity, TId>{

    TEntity Add(TEntity entity);

    void AddRange(Collection<TEntity> entities);

    TEntity Remove(TEntity entity);

    void RemoveRange(Collection<TEntity> entities);

    TEntity Update(TEntity entity);

    void UpdateRange(Collection<TEntity> entities);

    Collection<TEntity> GetAll();

    TEntity GetById(TId id);

    void ExecuteQuery(String command);

    int SaveChanges();
}