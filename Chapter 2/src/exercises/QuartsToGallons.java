package exercises;

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		final int Quarts = 18;
		final int Gallons = 4;
		int QuartsToGallons = Quarts / Gallons;
		int RemainingQuarts = Quarts % Gallons;
		
		System.out.println("If something needs " + Quarts + " quarts it needs " + QuartsToGallons + 
				" gallons with a remaining " + RemainingQuarts + " quarts.");
		
		
		
	}

}
