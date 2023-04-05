import java.util.Collection;

public class BaseController<TEntity, TId> implements IController<TEntity, TId> {
    
    private IRepository<TEntity, TId> _repo;

    public IRepository<TEntity, TId> GetRepository()
    {
        return _repo;
    }

    public String GetAll()
    {
        try
        {            
            return GetAllReturnResult(null);
        }
        catch (Exception ex)
        {
            return ex.getMessage();
        }             
    }

    public Collection<TEntity> AfterGetAll(Collection<TEntity> list)
    {
        return list;
    }

    public String GetAllReturnResult(Collection<TEntity> list)
    {
        return "";
    }

    //[HttpGet("{id}")]
    public String GetById(TId id)
    {
        try
        {
            TEntity entity = GetEntityById(id);
            return GetByIdReturnResult(entity);
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public TEntity GetEntityById(TId id)
    {
        try
        {
            TEntity entity = null;
            return AfterGetById(entity);
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public TEntity AfterGetById(TEntity entity)
    {
        return entity;
    }

    public String GetByIdReturnResult(TEntity entity)
    {
        return "";
    }

    //[HttpPost]
    public TEntity Post(TEntity entity)
    {
        try
        {
            return entity;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public TEntity BeforePost(TEntity entity)
    {
        return entity;
    }

    //[HttpPut]
    public TEntity Put(TEntity entity)
    {
        try
        {          
            return entity;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public TEntity BeforePut(TEntity entity)
    {
        return entity;
    }

    //[HttpPut("All")]
    public Collection<TEntity> PutAll(Collection<TEntity> entities)
    {
        try
        {            
            return entities;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    //[HttpDelete("{id}")]
    public String Delete(TId id) throws Exception
    {
        try
        {
            return "";
        }
        catch (Exception ex)
        {
            HandleException(ex);
        }

        return "";
    }

    public TEntity BeforeDelete(TEntity entity)
    {
        return entity;
    }

    public void BeforeDeleteAction(TEntity entity)
    {
        //
    }

    public void HandleException(Exception ex) throws Exception
    {           
        throw ex;
    }

    public void DeleteAll()
    {
        try
        {           
            AfterDeleteAll();
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public void AfterDeleteAll()
    {
        
    }
}
