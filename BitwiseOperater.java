package Operaters;

//|, &, ^ , ~
/* |- OR
 * &-AND
 * ^- XOR
 * ~- negation
*/



public class BitwiseOperater {
	public static void main(String[] args) {
		
		int a=4;
		int b=5;
		int c=a|b;
		int d= a&b;
		int e = a^b;
		int f=~9;
		int g=~-9;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
