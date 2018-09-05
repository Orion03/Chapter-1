package exercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		final int Inches;
		final int Feet = 12;
		
		System.out.println("How many Inches are there >> ");
		Inches = input.nextInt();
		
		int InchesToFeet = Inches / Feet;
		int RemainingInches = Inches % Feet;
		
		System.out.println("If something needs " + Inches + " inches it needs " + InchesToFeet + " feet with a remaining " + RemainingInches + 
				" Inches.");
		
	}

}
