import java.util.*;


public class Product{

    private String name;
    private Double price;
    private Int productID;

    public Product(List<String> lineList){
        this.name = lineList.get(0);
        this.price = lineList.get(1);
        this.productID = parseDouble(lineList.get(2));
    }

    public String getName()
    {
        return this.name;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public Int getProductID()
    {
        return this.productID;
    }

}