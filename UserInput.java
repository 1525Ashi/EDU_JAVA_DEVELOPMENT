package Operaters;

import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the First Number: ");
			int a= sc.nextInt();
			System.out.println("Enter the Second Number: ");
			int b= sc.nextInt();
			int c=a+b;
			System.out.println("the total of 2 number is : "+c);
		}

	}

}
