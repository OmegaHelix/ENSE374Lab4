import java.util.*;

public class OrderApplication
{
    private ArrayList<Order> activeOrders = new ArrayList<Order>();
    private ArrayList<Product> catalogue = new ArrayList<Product>();


    private Boolean importCatalogue(){
       
        return true;
    }

    public Boolean createOrder(Order order){

        return activeOrders.add(order);
    }

}