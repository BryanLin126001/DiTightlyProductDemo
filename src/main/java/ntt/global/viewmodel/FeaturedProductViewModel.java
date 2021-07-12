package ntt.global.viewmodel;

import java.util.List;

public class FeaturedProductViewModel
{

    private List<ProductViewModel> products;

    public FeaturedProductViewModel(List<ProductViewModel> products)
    {
        this.products = products;
    }

    public List<ProductViewModel> getProducts()
    {
        return products;
    }
}
