package ntt.global.dao;

import ntt.global.entity.Product;
import java.util.List;
import java.util.Optional;

public interface IProductDao
{
    Optional<Product>  get(int id);

    List<Product> get();

    List<Product> getFeaturedProduct();
}
