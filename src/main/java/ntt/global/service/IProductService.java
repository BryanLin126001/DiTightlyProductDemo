package ntt.global.service;

import ntt.global.entity.DiscountProduct;

import java.util.List;

public interface IProductService
{
    List<DiscountProduct> getFeaturedProducts();
}
