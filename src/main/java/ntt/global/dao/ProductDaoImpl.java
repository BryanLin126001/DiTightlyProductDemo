package ntt.global.dao;

import ntt.global.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoImpl extends BaseDao<Product> implements IProductDao
{
    public ProductDaoImpl()
    {
    }

    @Override
    public Optional<Product> get(int id)
    {
        return Optional.empty();
    }

    @Override
    public List<Product> get()
    {
        super.setQueryString(" from Product ");
        return super.get();
    }

    @Override
    public List<Product> getFeaturedProduct()
    {
        super.setQueryString(" from Product where is_featured = true ");
        return super.get();
    }
}
