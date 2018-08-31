package exercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int Total;
		
		String name;
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number >> ");
		num1 = input.nextInt();
		System.out.println("Please enter your second number >> ");
		num2 = input.nextInt();
		System.out.println("Please enter your name >> ");
		name = input.next();
		
		System.out.println("Your total is " + Total);
		Total = num1 + num2;
		System.out.println("Your name is " + name);

	}

}
