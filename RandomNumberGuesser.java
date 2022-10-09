/*
 * Class: CMSC203 
 * Instructor: Prof Eivazi
 * Description: Random Number Guesser class purpose: Generates a random
 *  number and asks the user to guess that number, giving appropriate feedback until
 *  that number has been guessed
 * Due: 10/08/2022
 * Platform/compiler: Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Axel Kiti
*/

import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(
				"This application generates a random integer between 0 and 100 and asks the user to guess repeatedly until they guess correctly.");
		String answer = "";
		do {
			RNG.resetCount();

			// Generating random number and storing it in randomNum
			int randomNum = RNG.rand();
			int min = 1;
			int max = 100;
			int userGuess;

			// Getting initial guess from the user:
			System.out.println("Please enter your first guess:");

			userGuess = keyboard.nextInt();
			if (userGuess == randomNum) {
				System.out.println("Congratulations, you guessed correctly");
				// Checking if the user wants to play again:
				System.out.println("Would you like to play again? (yes or no)");
				answer = keyboard.nextLine();
				answer = keyboard.nextLine();
				if (answer.equals("no")) {
					break;
				}
			}
			int count = RNG.getCount();

			// Checking to see if initial guess is between 1 and 100, then setting min/max:
			RNG.inputValidation(userGuess, min, max);
			if (userGuess > 1 && userGuess < randomNum) {
				System.out.println("Your Guess is too low");
				min = userGuess;
				count = RNG.getCount();
				System.out.println("Number of guesses is: " + count);

			} else if (userGuess > randomNum && userGuess < 100) {
				System.out.println("Your guess is too high");
				max = userGuess;
				count = RNG.getCount();
				System.out.println("Number of guesses is: " + count);
			}

			while (count < 7) {
				System.out.println("Enter your next guess between " + min + " and " + max);
				userGuess = keyboard.nextInt();
				if (RNG.inputValidation(userGuess, min, max) == false && RNG.getCount() < 7) {
					userGuess = keyboard.nextInt();
					if (RNG.getCount() == 6) {
						System.out.println("Sorry, but you've reached your maximum number of guesses");
						break;
					}
				}

				if (userGuess > 1 && userGuess < randomNum) {
					System.out.println("Your Guess is too low");
					min = userGuess;
					count = RNG.getCount();
					System.out.println("Number of guesses is: " + count);
				} else if (userGuess > randomNum && userGuess < 100) {
					System.out.println("Your guess is too high");
					max = userGuess;
					count = RNG.getCount();
					System.out.println("Number of guesses is: " + count);
				} else if (userGuess == randomNum) {
					System.out.println("Congratulations, you guessed correctly");

					// Checking if the user wants to play again:
					System.out.println("Would you like to play again? (yes or no)");
					answer = keyboard.nextLine();
					answer = keyboard.nextLine();
					if (answer.equals("yes")) {
						break;
					}
					if (answer.equals("no")) {
						break;
					}
				}
				if (count == 7) {
					System.out.println("Sorry, but you've reached your maximum number of guesses");
					break;
				}
			}
		} while (answer.equals("yes"));
		System.out.println("Thanks for playing!");
		System.out.println("Programmer name: Axel Kiti");
	}

}
