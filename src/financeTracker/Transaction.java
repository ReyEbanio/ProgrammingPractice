package financeTracker;
import java.time.LocalDateTime;
public class Transaction {
	private String category;
	private double amount;
	String type;
	private static int count=0;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Transaction.count = count;
	}
	LocalDateTime date;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Transaction(String category, double amount, String type, LocalDateTime date) {
		this.category = category;
		this.amount  = amount;
		this.date = date;
		this.type = type;
	}
	public String toString() {
	    return String.format("Category: %s | Amount: %.2f | Type: %s | Date: %s", category, amount, type, date);
	}
}
