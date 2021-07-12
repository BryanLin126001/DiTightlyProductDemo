package ntt.global.dao;

import ntt.global.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CommerceContext
{
    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Product.class)
            .buildSessionFactory();

    public Session getSession()
    {
        return factory.getCurrentSession();
    }

    public SessionFactory getFactoryInstance()
    {
        return factory;
    }
}
