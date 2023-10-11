package Array;

/*
 * collection of similar data type, value 
 * there r 2 types single and multi dimensional array
 * array r fixed data type
 * index value starts from '0' 
 * single dimensional array -> syntax int[] x , int []x, int x[]
 * At the time of declaration we cannot specify the size int [6] x
 * method x.length,x.clone()
 * 
 */


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x= {1,2,3,4,5}; //single dimension
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
//		System.out.println(x[5]);
		
//		 methods of array 
		System.out.println("length of a array: "+x.length);
		
		String[] s= {"a","aa","aaa","aaaa"}; 
		
		System.out.println(s[4].length());
		
		int[] a= {3,4,5,6};
		int[] b= a.clone();
		System.out.println(a!=b);
		
		int[] n= {123, 45,667};
		int m= n.length;
		System.out.println(m);
		

	}

}
