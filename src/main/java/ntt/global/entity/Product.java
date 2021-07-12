package ntt.global.entity;



import ntt.global.controller.IUserContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Entity
@Table(name="product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "is_featured")
    private boolean isFeatured;

    public Product()
    {
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int product_id)
    {
        this.productId = product_id;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String category)
    {
        this.description = category;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public boolean isFeatured()
    {
        return isFeatured;
    }

    public void setFeatured(boolean featured)
    {
        isFeatured = featured;
    }

}


