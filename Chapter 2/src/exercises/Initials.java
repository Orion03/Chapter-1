package exercises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String Initial1;
		String Initial2;
		String Initial3;
		
		System.out.println("What is your first initial >> ");
		Initial1 = input.next();
		
		System.out.println("What is your middle initial >> ");
		Initial2 = input.next();
		
		System.out.println("What is your last initial >> ");
		Initial3 = input.next();
		
		System.out.println("Your initials are " + Initial1 + "." + Initial2 + "." + Initial3 + 
				".");

	}

}
