package CoreJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int even[]=new int[5];
		int odd[]=new int[5];
		int prime[]= {11,13,17,19,23};
		for(int i=0;i<even.length;i++)
		{
			even[i]=i*2;
		}
		System.out.println("Enter 5 integer values for odd array1");
		for(int i=0;i<odd.length;i++)
		{
			odd[i]=sc.nextInt();
		}
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(even[i]);
		}
		for(i=0;i<prime.length;i++)
		{
			System.out.println(prime[i]);
		}
}

}
