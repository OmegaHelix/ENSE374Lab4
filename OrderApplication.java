import java.util.*;

public class OrderApplication
{
    private ArrayList<Order> activeOrders;
    private ArrayList<Product> catalogue;

    public OrderApplication()
    {
        this.activeOrders = new ArrayList<Order>();
    }

    private Boolean importCatalogue(){
       
        List<String> lineList = new List<String>();
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

}