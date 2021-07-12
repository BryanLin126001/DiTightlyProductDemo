package ntt.global.repository;

import ntt.global.entity.DiscountProduct;

import java.util.List;

public interface IProductRepository
{
    List<DiscountProduct> getFeaturedProducts();
}
