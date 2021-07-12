package ntt.global.service;

import ntt.global.entity.DiscountProduct;
import ntt.global.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService implements IProductService
{
    @Autowired
    private IProductRepository productRepository;

    public ProductService()
    {
    }

    @Override
    public List<DiscountProduct> getFeaturedProducts()
    {
        return productRepository.getFeaturedProducts();
    }
}
