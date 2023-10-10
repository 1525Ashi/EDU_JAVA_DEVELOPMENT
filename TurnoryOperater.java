package Operaters;



public class TurnoryOperater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=20;
//		int c;
//		c=(a<b)?a:b;
//		System.out.println(c);
		

//		
//		int a= 10;
//	    int b= 20;
//	    int c = 15;
//	    int max= (a > b && a > c) ? a :
//			(b > a && b > c) ? b : c;
//		
//		
//		System.out.println(max);
		
		int a=100, 
			b=20, 
			c=30, 
			d=200, 
			e=90;
		
		int max = (a>b && a>c && a>d && a>e)?a:
			      (b>a && b>c && b>d && b>e)?b:
				  (c>a && c>b && c>d && c>e)?c:
				  (d>a && d>b && d>c && d>e) ? d : e;
		
		System.out.println("largest out of 5 : " +max);
		    }
		}

