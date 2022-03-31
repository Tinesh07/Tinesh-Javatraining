package CoreJava;

public class Activity {
	public static void vote()
	{
	int Ragul_age=21;
	if(Ragul_age>18)
	System.out.println("Ragul have a right to vote");
	else
	System.out.println("Ragul does not have right to vote");
	}
	public static void profile()
	{
		String s1="TINESH";
		String s2="21";
		String s3="11/07/2000";
		String s4="MALE";
		String s5="PERAMBALUR";
		System.out.println("PROFILE");
		System.out.println("NAME:"+s1);
		System.out.println("AGE:"+s2);
		System.out.println("DOB:"+s3);
		System.out.println("GENDER:"+s4);
		System.out.println("CITY:"+s5);
	}
	public static int loop()
	{
		int i,fact=1,num=6;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("FACTORIAL OF"+num+"is:"+fact);
		return 0;
	}
		public static int division(int a,int b)
		{
			return(a/b);
		}

		public static void main(String[] args) {
			vote();
			profile();
			loop();
			int div=division(25,5);
			System.out.println("division"+div);
		}
}


