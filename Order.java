import java.util.*;

public class Order {

    private Date dateRecieved;
    private Double price;
    private int orderID;
    private Customer customer;
    private ArrayList<OrderLine> cart = new ArrayList<OrderLine>();
    
public Order(Customer customer, int orderID)
{
    this.orderID = orderID;
    this.customer = customer;
}
    public Date getDateRecieved()
    {
        return this.dateRecieved;
    }

    public Double calculatePrice()
    {   
        this.price = 0.0;
        // for each item in the cart
         for(OrderLine item : cart)
         {
             // calculate the quantity and therefore price
            this.price += item.getProduct().getPrice() * item.getQuantity();
         }
         // give the customer their discount rating
         this.price -= this.price * customer.getDiscountRating();
         //return the value, can be used with a getter later.
         return this.price;
    }

}