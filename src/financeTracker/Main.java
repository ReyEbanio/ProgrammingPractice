package financeTracker;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
  	FinanceTracker tracker = new FinanceTracker();
  	
	public static void main(String[] args) {
		Main a = new Main();
		
		boolean loopMe = true;
		try {
		while(loopMe) {
			System.out.println("""
					1 = Add transaction
					2 = View summary
					3 = View specific category
					4 = Exit 
					""");
			System.out.print("Choice: ");
			int choice = input.nextInt();
			switch(choice) {

			case 1: 
				a.addTransaction();
				break;
			case 2:
				a.callDisplay();
				break;
			case 3:
				a.specificSearch();
				break;
			case 4:
				System.out.println("Thank you for dropping by.");
				loopMe = false;
				break;
				default:
					System.out.println("Please try again.");
					break;
			}
			
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void specificSearch() {
		System.out.println("What type of expense are you looking for?");
		String choicePrint = input.next();
		tracker.showSpecificType(choicePrint);
	}
	public  void addTransaction() {
		System.out.print("Enter category: ");
		String category = input.next();
		
		System.out.print("What: ");
		String expenseType = input.next();
		
		System.out.print("Enter amount: ");
		double amountSpent = input.nextDouble();
		
		LocalDateTime dateTimeOfTransac = LocalDateTime.now();
		
		Transaction transac = new Transaction(category, amountSpent, expenseType, dateTimeOfTransac);
		
		tracker.addTransaction(transac);
		
	}
	
	public void callDisplay() {
		tracker.showSummary();
	}
	
	
	
}



























