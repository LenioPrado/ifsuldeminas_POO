import java.util.Collection;

public abstract class BaseRepository<TEntity,Context, TId> implements IRepository<TEntity, TId> {
        
    protected Context _context;

    public BaseRepository(Context context)
    {
        _context = context;
    }

    public Context GetContext()
    {
        return _context;
    }

    public TEntity Add(TEntity entity)
    {            
        return AfterAdd(entity);
    }

    protected TEntity BeforeAdd(TEntity entity)
    {
        return entity;
    }

    protected TEntity AfterAdd(TEntity entity)
    {
        return entity;
    }

    public void AddRange(Collection<TEntity> entities)
    {
        BeforeAddRange(entities);
    }

    protected Collection<TEntity> BeforeAddRange(Collection<TEntity> entities)
    {
        return entities;
    }

    public TEntity Update(TEntity entity)
    {            
        entity = BeforeUpdate(entity);
        return AfterUpdate(entity);
    }

    protected TEntity BeforeUpdate(TEntity entity)
    {
        return entity;
    }

    protected TEntity AfterUpdate(TEntity entity)
    {
        return entity;
    }

    public void UpdateRange(Collection<TEntity> entities)
    {
        //
    }

    public TEntity Remove(TEntity entity)
    {            
        entity = BeforeRemove(entity);
        return AfterRemove(entity);
    }

    protected TEntity BeforeRemove(TEntity entity)
    {
        return entity;
    }

    protected TEntity AfterRemove(TEntity entity)
    {
        return entity;
    }

    public void RemoveRange(Collection<TEntity> entities)
    {
        BeforeRemoveRange(entities);
    }

    protected Collection<TEntity> BeforeRemoveRange(Collection<TEntity> entities)
    {
        return entities;
    }


    public Collection<TEntity> GetAll()
    {
        return AfterGetAll(null);
    }

    protected Collection<TEntity> AfterGetAll(Collection<TEntity> set)
    {
        return set;
    }

    public TEntity GetById(TId id)
    {
        TEntity entity =  null;
        return AfterGetById(entity);
    }

    public TEntity AfterGetById(TEntity entity)
    {
        return entity;
    }        

    public void ExecuteQuery(String sqlCommand)
    {
        try
        {
            // Executar comando;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }       

    public int SaveChanges()
    {
        return 0;
    }
}
