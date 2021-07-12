package ntt.global.controller;

import ntt.global.entity.DiscountProduct;
import ntt.global.service.IProductService;
import ntt.global.viewmodel.FeaturedProductViewModel;
import ntt.global.viewmodel.ProductViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/display")
public class ShowProductControler
{
    IProductService productService;

    @Autowired
    public ShowProductControler(IProductService productService)
    {
        this.productService = productService;
    }

    @RequestMapping("/showProduct")
    public String showProduct(Model model)
    {
//        Product product = productService.getProductInfo();
        List<DiscountProduct> discountProducts = productService.getFeaturedProducts();


        List<ProductViewModel> featuredProducts = new ArrayList<ProductViewModel>();
        discountProducts.forEach(x -> featuredProducts.add(new ProductViewModel(x.getProductName(), x.getPrice())));

        FeaturedProductViewModel vm = new FeaturedProductViewModel(featuredProducts);

        ProductViewModel productInside = vm.getProducts().get(0);

        System.out.println("Got product: " + productInside);
        System.out.println("Got product: " + productInside.getProductName());
        System.out.println("Got product: " + productInside.getPrice());



        model.addAttribute("prodInfo", vm.getProducts().get(0));


        return "ShowProduct";

    }


}
