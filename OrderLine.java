import java.util.*;

public class OrderLine{

    private Int quantity;
    private Double price;
    private Product product;

    OrderLine(Produt product, Int quantity, Double price)
    {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct()
    {
        return this.product;
    }

    public Int getQuantity()
    {
        return this.quantity;
    }

    public Double getPrice()
    {
        return this.price;
    }
}