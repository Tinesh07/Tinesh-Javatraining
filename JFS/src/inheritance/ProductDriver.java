package inheritance;

import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Product Price");
		int product_price=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Rating");
		float product_rating=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter brand name");
		String brand_name=sc.nextLine();
		
		if(brand_name.equalsIgnoreCase("ajio")) {
			Ajio ajio=new Ajio();
			ajio.setProduct_price(product_price);
			ajio.setProduct_rating(product_rating);
			ajio.discount(ajio.getProduct_price());
	        System.out.println(ajio);
		}
		else if(brand_name.equalsIgnoreCase("myntra")) {	
		Myntra myntra=new Myntra();
		myntra.setProduct_price(product_price);
		myntra.setProduct_rating(product_rating);
		myntra.cashback(product_rating);
		System.out.println(myntra);
		}
		
		
		
		

	}

}
