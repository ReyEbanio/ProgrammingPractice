package review;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String toSolve = "";
		
		while(true) {
		System.out.print("Enter the equation:");
		 toSolve = input.next(); 
		 if(toSolve.equalsIgnoreCase("stop"))break;
		char[] inputArray = toSolve.toCharArray();
		Arrays.sort(inputArray);
		char operation = inputArray[0];
		int answer = performOperation(toSolve, operation);
		System.out.println(toSolve+"="+answer);
		}
	}
	
	public static int performOperation(String toSolve, char operation) {
		int answer = 0;
		for(int a = 0; a < toSolve.length(); a++) {
			char b = toSolve.charAt(a);
			if(b == operation) {
				int firstNum = Integer.parseInt(toSolve.substring(0, a));
				int secondNum = Integer.parseInt(toSolve.substring(a+1));
				switch(operation) {
				case '+':
					answer = firstNum + secondNum;
					return answer;
				case '-':
					answer = firstNum - secondNum;
					return answer;
				case '/':
					answer = firstNum / secondNum;
					return answer;
				case '*':
					answer = firstNum * secondNum;
					return answer;
					default:
						System.out.println("Try Again.");
				}
			}
		}
		return 0;
	}
}










