package BankoOfThePhilippines;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankOfRey {
	static Integer userId = 111;
	static Integer transactionId;
	Map<String, Clients> clientDetails = new HashMap<>();
	Map<Integer, Double> transactions = new HashMap<>();

	static Scanner input = new Scanner(System.in);
	static BankOfRey mainBank = new BankOfRey();

	public static void main(String[] args) {
		mainBank.displayChoice(mainBank);
	}

	public void signUp() {
		System.out.println("Enter your username: ");
		String userName = input.next();
		System.out.println("Enter you Pasword: ");
		String password = input.next();
		String userType = "User";

		clientDetails.put(userName, new Clients(password, userType, userId));
		userId++;
		displayChoice(mainBank);
	}

	public void displayChoice(BankOfRey mainBank) {
		Scanner input = new Scanner(System.in);
		System.out.println("""
				WELCOME TO MY BANK:
				[SI] = Sign in
				[SU] = Sign up
								""");
		String choiceTransac = input.next();
		do {
			switch (choiceTransac) {
			case "SI":
				signIn();
				break;
			case "SU":
				signUp();
				break;
			default:
				System.out.println("Please choose again");
				break;
			}
		} while (true);
	}

	public void signIn() {
		System.out.print("Enter your User name: ");
		String userName = input.next();
		System.out.print("Enter your password: ");
		String userPassword = input.next();
		validateAccount(userName, userPassword);
	}

	public void validateAccount(String userName, String userPassword) {
		// Rey, rey1 , User, 111
		if (!clientDetails.containsKey(userName)) {
			System.out.println("Your username doesn't exist");
			displayChoice(mainBank);
		}
		Clients client = clientDetails.get(userName);
		String passwordUser = client.getPassword();
		if (!passwordUser.equals(passwordUser)) {
			System.out.println("Your password is wrong.");
			displayChoice(mainBank);
		}
		transactionId = client.getUserKey();
		userLandingPage();
	}

	public void userLandingPage() {

		System.out.print("""
				[DPS] Deposit money
				[WDR] Withdraw money
				[EXIT] Exit
				""");
		String choice = input.next();
		switch (choice) {
		case "DPS":
			depositMoney();
			break;
		case "WDR":
			withdrawMoney();
			break;
		case "Exit":
			System.out.println(transactions);
			displayChoice(mainBank);
			break;
		default:
			System.out.println("Select again.");
			userLandingPage();
			break;
		}
	}

	public void depositMoney() {
		System.out.print("Enter amount: ");
		try {
			Double deposit = input.nextDouble();
		transactions.put(transactionId, transactions.getOrDefault(transactionId, 0.0) + deposit);
		userLandingPage();
		} catch(Exception e) {
			System.out.println("Enter a valid amount.");
			depositMoney();
		}
	}

	public void withdrawMoney() {
		System.out.print("Enter amount: ");
		Double withdraw = input.nextDouble();
		transactions.put(transactionId, transactions.getOrDefault(transactionId, 0.0) - withdraw);
		userLandingPage();
	}
}
