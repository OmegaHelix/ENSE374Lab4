import java.util.*;
import java.lang.Integer;


public class Product{

    private String name;
    private Double price;
    private int productID;

    public Product(List<String> lineList){
        this.name = lineList.get(0);
        this.price = Double.parseDouble(lineList.get(2));
        this.productID = Integer.parseInt(lineList.get(1));
    }

    public String getName()
    {
        return this.name;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public int getProductID()
    {
        return this.productID;
    }

}