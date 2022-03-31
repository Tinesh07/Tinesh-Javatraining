package inheritance;

public class ProductBasicInfo {
	int Product_price;
	float Product_rating;

	public int getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(int product_price) {
		Product_price = product_price;
	}
	public float getProduct_rating() {
		return Product_rating;
	}
	public void setProduct_rating(float product_rating) {
		Product_rating = product_rating;
	}
	
	public ProductBasicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductBasicInfo [Product_price=" + Product_price + ", Product_rating=" + Product_rating
				+ " getProduct_price()=" + getProduct_price()
				+ ", getProduct_rating()=" + getProduct_rating()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
