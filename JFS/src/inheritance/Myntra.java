package inheritance;

public class Myntra extends ProductBasicInfo{
	void cashback(float Product_Rating) {
		if(Product_rating>4.5f ) {
			System.out.println("Cashback Available");
		}
		else {
			System.out.println("OOPS Cashback not Available");
		}
	}
	


}
