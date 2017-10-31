import java.util.*;

public class Customer {

    private String name;
    private String address;
    private Float creditRating;
    private Float discountRating;




	/**
	 * @return the discountRating
	 */
	public Float getDiscountRating() {
		return discountRating;
	}


	/**
	 * @param discountRating the discountRating to set
	 */
	public void setDiscountRating(Float discountRating) {
		this.discountRating = discountRating;
	}


	/**
	 * @return the creditRating
	 */
	public Float getCreditRating() {
		return creditRating;
	}


	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(Float creditRating) {
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