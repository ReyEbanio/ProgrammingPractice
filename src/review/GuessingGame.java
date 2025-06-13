package review;

import java.util.Scanner;

public class GuessingGame {
	static Scanner input = new Scanner(System.in);
	static int number = (int) (Math.random() * 100);
	
	public static void guessNumber(int guessLimit) {
		int guessNumber = 0;
		boolean displayMe = true;
		for(int i = guessLimit; i > 0; i--) {
			System.out.println("Guess " +i+  " times only");
			guessNumber = input.nextInt();
			if (guessNumber == number) {
				System.out.println("Great you win.");
				displayMe = false;
				break;
			}
			String clue = guessNumber > number ? "Lower." : "Higher";
			System.out.println(clue);
		}
		if(displayMe)System.out.println("Number is :"+number+" Thanks for trying.");
	}
	public static void main(String[] args) {

		String rules = """
				When the game starts, it should display a welcome message along with the rules of the game.
				The computer should randomly select a number between 1 and 100.
				User should select the difficulty level (easy, medium, hard) which will determine the number of chances they get to guess the number.
				The user should be able to enter their guess.
				If the user’s guess is correct, the game should display a congratulatory message along with the number of attempts it took to guess the number.
				If the user’s guess is incorrect, the game should display a message indicating whether the number is greater or less than the user’s guess.
				The game should end when the user guesses the correct number or runs out of chances.""";

		//System.out.println(rules);
		System.out.println("Choose difficulty: ");
		String choiceDif = input.next();
		switch (choiceDif) {
		case "Easy":
			guessNumber(999);
			break;
		case "Medium":
			guessNumber(10);
			break;
		case "Hard":
			guessNumber(5);
			break;
		}
	}
}



























