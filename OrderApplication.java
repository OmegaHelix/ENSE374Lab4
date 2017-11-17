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

        newOrder.addToCart(myApp.catalogue.get(19), 6);
        newOrder.addToCart(myApp.catalogue.get(87), 14);
        newOrder.addToCart(myApp.catalogue.get(12), 1);
        newOrder.addToCart(myApp.catalogue.get(13), 1);
        newOrder.addToCart(myApp.catalogue.get(24), 2);
        newOrder.addToCart(myApp.catalogue.get(56), 4);
        newOrder.addToCart(myApp.catalogue.get(23), 8);
        newOrder.addToCart(myApp.catalogue.get(89), 12);
        newOrder.addToCart(myApp.catalogue.get(53), 7);
        newOrder.addToCart(myApp.catalogue.get(89), 12);
System.out.println("Cart price is: " + toString(newOrder.calculatePrice());

        while(input != 'q')
        {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of an option:");
        System.out.print("1: Add an item");
        System.out.print("2: Delete an item");
        System.out.print("Enter 'q' to exit");
        input =  buff.readLine();
        if(input == "q")
        break;
        try{
                int i = Integer.parseInt(input);
            }
        catch(NumberFormatException nfe)
            {
                System.err.println("Invalid input!");
            }
        switch(input)
        {
            case 1: 
            
            break;
            case 2: 

            break;
            case 'q': 
            
            break;
        }
    }

}