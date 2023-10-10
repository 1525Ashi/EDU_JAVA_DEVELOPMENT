package ashika;
// single 
/* multi line  coment */

// 1 local - with in the function
// 2 instance - with in the class . to access instance variable v need to create object 
// 3 static 
class Integer{
	int f;
	
}
class Fot{
	float d;
	
}
class Sdf{
	String name;
	
}
class Character{
	char c;
}

public class sec2 {
	
//	
//	int a=10;
//	static int b=20; //static variable is represented with static x
	
	public static void main(String[] args) {
		
		
//		
//		// TODO Auto-generated method stub
//		int a=1234678910;// 11 digit // local variable 
//		long ad=123456789123456789l;//19 digit
//		float ac=10.1111111f;//6 digit after decimal
//		double ab=10.11111111111111111d;//14 digit after decimal
//		
//		//classname objectname = new TypesOfVariables();
//		int s=10;
//		sec2 ob=  new sec2();
//		
//		System.out.println(s);
		
//		System.out.println(ob.a);
//		
//		System.out.println(sec2.b);
		
		Integer ob1=  new Integer();
		Fot ob2=  new Fot();
		Sdf ob3 = new Sdf();
		Character ob4 = new Character();
				
		System.out.println(ob1.f);
		System.out.println(ob2.d);
		System.out.println(ob3.name);
		System.out.println(ob4.c);
		

	}

}
