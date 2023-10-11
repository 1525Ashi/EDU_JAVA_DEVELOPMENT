package ConditionalStatement;

public class Ifcondition {
	public static void main (String[] args) {
		// largest
		int a=8,
				b=20,
				c=7;
		if (a>b && a>c)
		{
			System.out.println(a);
			
		}
		else if (b>a && b>c)
		{
			System.out.println(a);
			
		}
		
		else
		{
			System.out.println(c);
		}
		
		// even number 
		
		int a1=21;
		if(a%2==0)
		{
			System.out.println("it is a even number");
		}
		else 
		{
			System.out.println("it is a odd number");
		}
		
		
		//score
		int A=95, B=89, C=69, D= 98, E =98, F=97;
		double total_score = A+B+C+D+E+F;
		double per= total_score * 100/600;
		System.out.println("percentage is : " +per +"%");
		if (per>=90) {
			System.out.println("A");
		}
		else if (per>=80) {
			System.out.println("B");
		}
		else if (per>=60) {
			System.out.println("C");
		}
		
		else 
		{
			System.out.println("F better luck next time");
		}
		
	}
	
}
