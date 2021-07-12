package ntt.global.viewmodel;


public class ProductViewModel
{
    private String productName;
    private int price;

    public ProductViewModel(String productName, int price)
    {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }


    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "ProductViewModel{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

}
