package StringMethods;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x=12, y=2,z=3;
//		switch (x+12) {
//		
//		case 12+12:
//			System.out.println("34");//condition should match 
//		    break;
//		    
//		default:
//				System.out.println("invalied choice");
//		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the choice : ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("register here");
//			break;
			
		case 2:
			System.out.println("login");
//			break;
		
		case 3:
			System.out.println("edit profile");
//			break;
		case 4:
			System.out.println("view profilr");
			break;
			
		default:
			System.out.println("invalied option");
			
		}
		
	}

}
