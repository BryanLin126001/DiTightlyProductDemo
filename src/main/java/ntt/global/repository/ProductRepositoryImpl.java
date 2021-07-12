package ntt.global.repository;

import ntt.global.controller.IUserContext;
import ntt.global.dao.IDao;
import ntt.global.dao.IProductDao;
import ntt.global.entity.DiscountProduct;
import ntt.global.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepositoryImpl implements IProductRepository
{
    private IUserContext iUserContext;
    private IProductDao productDao;

    public ProductRepositoryImpl()
    {
    }

    @Autowired
    public ProductRepositoryImpl(IUserContext iUserContext, IProductDao productDao)
    {
        this.iUserContext = iUserContext;
        this.productDao = productDao;
    }

    @Override
    public List<DiscountProduct> getFeaturedProducts()
    {
        double discount = (iUserContext.IsPreferredUser())? 0.95 : 1;
        List<Product> products =  productDao.getFeaturedProduct();
        ArrayList<DiscountProduct> discountProducts = new ArrayList<DiscountProduct>();
        products.forEach( x-> discountProducts.add(new DiscountProduct(x.getProductName(), (int) (x.getPrice() * discount))));
        return discountProducts;
    }
}
