import java.util.*;
import java.io.*;
import java.nio.file.Paths;

public class OrderApplication
{
    private ArrayList<Order> activeOrders;
    private ArrayList<Product> catalogue;

    public OrderApplication()
    {
        this.activeOrders = new ArrayList<Order>();
    }

    private Boolean importCatalogue(){
       
        List<String> lineList;
        this.catalogue = new ArrayList<Product>();
		String line = new String();
		try {
			Scanner fileIn = new Scanner(Paths.get("catalog.csv"));
			if(fileIn.hasNextLine())
			{
				line = fileIn.nextLine(); // skips header row
			}
			while (fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                lineList = Arrays.asList(line.split(","));
				catalogue.add(new Product(lineList));
			}
			fileIn.close();
		
		}
		 
		catch (IOException e) {
            e.printStackTrace();
            return false;
		}
        return true;
    }

    public Boolean createOrder(Order order){

        return activeOrders.add(order);
    }


    public static void main(String[] args) {
        
        OrderApplication myApp = new OrderApplication();
        myApp.importCatalogue();

        PersonalCustomer first_Customer = new PersonalCustomer();
        Order newOrder = new Order(first_Customer, 1);

    }

}