import java.util.*;

public class OrderLine{

    private int quantity;
    private Double price;
    private Product product;

    OrderLine(Product product, int quantity, Double price)
    {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct()
    {
        return this.product;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public Double getPrice()
    {
        return this.price;
    }
}