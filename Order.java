import java.util.*;

public class Order {

    private Date dateRecieved;
    private Double price;
    private Int orderID;
    private Customer customer;
    private ArrayList<OrderLine> cart = new ArrayList<OrderLine>();
    

    public Date getDateRecieved()
    {
        return this.dateRecieved;
    }

    public Double calculatePrice()
    {   
        this.price = 0;
         for(OrderLine item : cart)
         {
            this.price += cart.getPrice();
         }
         return this.price;
    }

}