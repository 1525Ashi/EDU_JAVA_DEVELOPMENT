package StringMethods;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Option 1");
			break;
			
		case 2:
			System.out.println("option 2");
			break;
		
		case 3:
			System.out.println("option 3");
			break;
			
		default:
			System.out.println("invalied option");
			
		}

	}

}
