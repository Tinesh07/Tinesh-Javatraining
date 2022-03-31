package inheritance;


public class Ajio extends ProductBasicInfo{
	void discount(int Product_price) {
		if(Product_price>1000) {
			System.out.println("Discount available");
		}
		else {
			System.out.println("OOPS Discount not available");
		}
	}
	
	
}

