package proj;

import java.util.Scanner;

public class Guesser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int position = 50;
		boolean guess = false;
		String answer;
		System.out.println("Think of a number between 1 and 100. I will try to guess it.");
		System.out.printf("Is your number higher than, lower than, or equal to %d?\n", position);
		int max = 100;
		int min = 1;
		while (guess == false) {
			answer = scanner.next();
			int pos = (max + min) / 2;
			if (max == min)
				guess = true;
			switch (answer) {
				case "higher": 
				case "up" :
				case "1":
					min = pos + 1;
					System.out.printf("Is your number higher than, lower than, or equal to " + (max + min) / 2 + "?\n");
					break;
				case "lower":
				case "down":
				case "0":
					max = pos - 1;
					System.out.printf("Is your number higher than, lower than, or equal to " + (max + min) / 2 + "?\n");
					break;
				case "equal":
				case "yes":
				case "3":
				case "equals":
					guess = true;
					break;
				default:
					System.out.println("Incorrect Format. Please try again.");
					break;
					
				}
			if (guess == true)
				System.out.printf("Your number is " + pos + ".\n");
		
		}
		scanner.close();
		
	}

}
