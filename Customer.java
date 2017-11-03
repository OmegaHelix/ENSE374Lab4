import java.util.*;

public class Customer {

    private String name;
    private String address;
    private Double creditRating;
    private Double discountRating;


	public Customer()
	{
		this.name = "fake";
		this.address = "fake";
		this.creditRating = 0.0;
		this.discountRating = 0.0;
	}

	/**
	 * @return the discountRating
	 */
	public Double getDiscountRating() {
		return this.discountRating;
	}


	/**
	 * @param discountRating the discountRating to set
	 */
	public void setDiscountRating(Double discountRating) {
		this.discountRating = discountRating;
	}


	/**
	 * @return the creditRating
	 */
	public Double getCreditRating() {
		return creditRating;
	}


	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(Double creditRating) {
		this.creditRating = creditRating;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


}