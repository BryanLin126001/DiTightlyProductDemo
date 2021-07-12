package ntt.global.entity;

public class DiscountProduct
{
    private String productName;
    private int price;

    public DiscountProduct(String productName, int price)
    {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName()
    {
        return productName;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
