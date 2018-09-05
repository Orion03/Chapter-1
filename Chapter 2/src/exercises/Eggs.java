package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double SingularEgg = .45;
		double DozenOfEggs = 3.25;
		int NumberOfEggs;
		int Dozen = 12;
		
		System.out.println("Insert the amount of eggs you have >> ");
		NumberOfEggs = input.nextInt();
		
		int RemainingEggs = NumberOfEggs % 12;
		double Total = (RemainingEggs * 0.45) + ((NumberOfEggs / Dozen) * 3.25);
		
		System.out.println("You ordered a total of " + NumberOfEggs + " eggs. That's " + 
		NumberOfEggs / Dozen + " dozen at $3.25 per dozen and " + RemainingEggs + 
		" loose eggs at 45 cents each for a total of $" + Total);
		
	}

}
