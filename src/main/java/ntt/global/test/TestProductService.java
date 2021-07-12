package ntt.global.test;

import ntt.global.entity.DiscountProduct;
import ntt.global.service.ProductService;

import java.util.List;

public class TestProductService
{
    public static void main(String[] args)
    {
        ProductService ps = new ProductService();
        List<DiscountProduct> products =  ps.getFeaturedProducts();

    }
}
