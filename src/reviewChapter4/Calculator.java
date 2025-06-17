package reviewChapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		displayAnswer(performOperation(getInput()));
		
	}
	public static void displayAnswer(int answer) {
		System.out.println(" = "+answer);
	}
	
	public static String getInput() {
		Scanner input = new Scanner(System.in);
		String toSolve = "";
		System.out.print("Enter the equation:");
		toSolve = input.next();
		if (toSolve.equalsIgnoreCase("stop")) {
			return "";
		} else {
			return toSolve;
		}
	}

	public static int performOperation(String toSolve) {
		char[] inputArray = toSolve.toCharArray();
		Arrays.sort(inputArray);
		char operation = inputArray[0];
		int answer = 0;
		for (int a = 0; a < toSolve.length(); a++) {
			char b = toSolve.charAt(a);
			if (b == operation) {
				int firstNum = Integer.parseInt(toSolve.substring(0, a));
				int secondNum = Integer.parseInt(toSolve.substring(a + 1));
				switch (operation) {
				case '+' -> answer = firstNum + secondNum;
				case '-' -> answer = firstNum - secondNum;
				case '/' -> answer = firstNum / secondNum;
				case '*' -> answer = firstNum * secondNum;
				default -> System.out.println("Try Again.");
				}
			}
		}
		return answer;
	}
}
