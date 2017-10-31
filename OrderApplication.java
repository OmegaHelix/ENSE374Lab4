import java.util.*;

public class OrderApplication
{
    private ArrayList<Order> activeOrders = new ArrayList<Order>();
    private ArrayList<Product> catalogue = new ArrayList<Product>();


    private Boolean importCatalogue(){
       
        this.catalogue = new ArrayList<Product>();
		String line = new String();
		try {
			Scanner fileIn = new Scanner(Paths.get("catalog.cvs"));
			if(fileIn.hasNextLine())
			{
				line = fileIn.nextLine(); // skips header line
			}
			while (fileIn.hasNextLine()) {
				line = fileIn.nextLine();
				employees.add(new Product(line));
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

}