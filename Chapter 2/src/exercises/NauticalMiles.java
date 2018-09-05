package exercises;

import java.util.Scanner;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int NauticalMile;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert a number of nautical miles >> ");
		NauticalMile = input.nextInt();
		
		double Kilometer = 1.852 * NauticalMile;
		double Mile = 1.150779 * NauticalMile;
		
		System.out.println(NauticalMile + " nautical miles equals " + Kilometer + " kilometer(s) and " + 
		Mile + " miles.");
	}

}
