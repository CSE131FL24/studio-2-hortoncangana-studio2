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
		
		if (startAmount> 0 && startAmount < winLimit) {
			if ( Math.random()< winChance) {
				for (int newAmount = startAmount; startAmount < winLimit;newAmount++) {
				System.out.println(newAmount);
				
			}
			/*else {
				int newAmount = startAmount - 1;
				System.out.println(newAmount);
				break;*/
			}

			}
	
		}
		
	
	}

}
