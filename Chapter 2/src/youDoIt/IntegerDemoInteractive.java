package youDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an interger >> ");
		anInt = nextInt();
		
		System.out.println("Please enter an interger >> ");
		aByte = nextByte();
		
		System.out.println("Please enter an interger >> ");
		aShort = nextShort();
		
		System.out.println("Please enter an interger >> ");
		aLong = nextLong();
		
		System.out.println("What is your name >> ");
		name = input.nextLine();
		
		System.out.println("Your name is " + name);
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
			
	}

}
