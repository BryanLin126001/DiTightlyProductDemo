package ntt.global.dao;

import ntt.global.entity.Product;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public abstract class BaseDao<T>
{
    private final CommerceContext dbContext;
    private final Session session;
    private String queryString;

    public BaseDao()
    {
        dbContext = new CommerceContext();
        session = dbContext.getSession();
    }

    public List<T> get()
    {
        List<T> list = null;
        try
        {
            session.beginTransaction();
            list = session.createQuery(queryString).getResultList();
            session.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            session.close();
            dbContext.getFactoryInstance().close();
        }
        return list;
    }

    public void setQueryString(String queryString)
    {
        this.queryString = queryString;
    }
}
