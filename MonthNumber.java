package BasicPrograms;

import java.util.Scanner;

public class MonthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month number:");
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("feb");
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
			
			default:
				System.out.println("its a wrong input");
			
			
		}
		
		

	}

}
