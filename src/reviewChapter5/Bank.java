package reviewChapter5;

import java.util.HashMap;

public class Bank {
	 static HashMap<String, Double> transactionAccount = new HashMap<>();
	 static String username = "";
	 
	public static void main(String[] args) {
		Bank persons = new Bank();
		
		persons.transaction("Rey", 1000.0);
		persons.transaction("Rey", -55.50 );
		persons.transaction("Rissa", 5900.50 );
		persons.transaction("Rissa", -590.50 );
		
		System.out.println(transactionAccount);
		testAssign();
		System.out.println(username);
	}
		public void transaction(String name, Double transactions) {
			transactionAccount.put(name, transactionAccount.getOrDefault(name, 0.0)+transactions);
		}
		public static void testAssign() {
			username = "Test";
		}
	}
