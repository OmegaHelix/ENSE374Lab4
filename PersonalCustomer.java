import java.util.*;


public class PersonalCustomer extends Customer{
    
    private int creditCardNumber;

    public int getCreditCardNumber()
    {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }

}