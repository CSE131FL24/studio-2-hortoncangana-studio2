package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//start amount 
		System.out.println("Start amount of money: ");
		int startAmount = in.nextInt();
		
		//Win Chance
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		
		//Win limit
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt(); 
		
		//loop
		
		while (startAmount > 0 && startAmount <= winLimit) {
			if ( Math.random()< winChance) {
				
				startAmount += 1; 
				System.out.println("Success! +1"); 
				
			
				
			}
			else {
				startAmount -= 1; 
				System.out.println("Fail -1"); 
				

				
			}
			System.out.println("Current amount"+ startAmount); 

			}
		if (startAmount >= winLimit) {
		System.out.println ("The day was a success"); 
		
		} 
		
		else {
		System.out.println("Ruin!"); 
		}
	
	}

}
