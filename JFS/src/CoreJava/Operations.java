package CoreJava;

public class Operations {
	public static int multiplication(int a,int b)
	{
		return(a*b);
	}
	public static int division(int a,int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		int mul=multiplication(4,5);
		int div=division(4,5);
		System.out.println("multiplication"+mul);
		System.out.println("division"+div);


	}

}
