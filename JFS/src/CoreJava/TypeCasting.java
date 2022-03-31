package CoreJava;

public class TypeCasting {

	public static void main(String[] args) {
		double d=6.4;
		int a=8;
		int type=a+(int)d;
		System.out.println(type);
		double e=d+a;
		System.out.println(e);

	}

	@Override
	public String toString() {
		return "TypeCasting [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
