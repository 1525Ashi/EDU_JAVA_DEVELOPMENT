package TypeCast;

/*
 * byte - 1 to 3 digit
 * int -11 digit
 * double 14 digit after decimal
 * long - 19 digit
 * float 6 digit after decimal 
 * */

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=123;
		int c = b; //implicit
		System.out.println(c);
		
		int d= 23;
		double f = d;
		System.out.println(f);
		
		long c1= 343456789;
		int d1 = (int) c1; //explicit type cast
		System.out.println(d1);

		String num10 = "42";
		int num1 = Integer.parseInt(num10); //explicit type cast
		System.out.println(num1);
		
		double g =12345.67890897654321467;
		float h= (float) g;
		System.out.println(h);
		
		int i1= 123;
		byte i2= (byte) i1;
		System.out.println(i2);
		
		
		
	}

}
