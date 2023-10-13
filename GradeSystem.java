package BasicPrograms;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("greade and percentage calculater");
		System.out.println("English : ");
		int Engl =sc.nextInt();
		
		System.out.println("Kannada: ");
		int Kan = sc.nextInt();
		
		System.out.println("Hindi: ");
		int Hin = sc.nextInt();
		System.out.println("Maths: ");
		int Mat = sc.nextInt();
		System.out.println("Science: ");
		int Sci= sc.nextInt();
		System.out.println("Social: ");
		int Soc = sc.nextInt();
		
		double total_score = Engl+Hin+Kan+Mat+Sci+Soc;
		
		double per= total_score * 100/600;
		int grade = (int) per;
		
		System.out.println("percentage is : " +per +"%");
				
		switch (grade /10) {
		case 10:
		case 9:
			/* Marks between 90-100 */
			System.out.print("\n=============================");
			System.out.print("\nYour Grade Is: A or Excellent");
			System.out.print("\n=============================");
			break;
		case 8:
		case 7:
			/* Marks between 70-89 */
			System.out.print("\n=============================");
			System.out.print("\nYour Grade Is: B or Very Good");
			System.out.print("\n=============================");
			break;
		case 6:
			/* Marks between 60-69 */
			System.out.print("\n========================");
			System.out.print("\nYour Grade Is: C or Fair");
			System.out.print("\n========================");
			break;
		case 5:
		case 4:
			/* Marks between 40-59 */
			System.out.print("\n========================");
			System.out.print("\nYour Grade Is: D or Pass");
			System.out.print("\n========================");
			break;
		default:
			/* Marks less than 40 */
			System.out.print("\n================================================");
			System.out.print("\nYou Grade Is: F or Fail\n");
			System.out.print("\nSuggetin: Do Not show your Sheet to Your Parent");
			System.out.print("\n================================================");
			
		}

	}

}
