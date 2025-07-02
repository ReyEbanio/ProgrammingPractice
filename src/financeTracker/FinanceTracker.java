package financeTracker;

import java.util.ArrayList;
import java.util.List;

public class FinanceTracker {
		final int age = 5;
		private int test = 5;
		private List<Transaction> transactions = new ArrayList<>();
		
		public static void main(String[] args) {

			System.out.println("test");
			int [] deptList = {1000, 2000,300};
			checkVarargs(5, null);
		}
		
		public static void checkVarargs( int test, int...twoInt) {
			System.out.println(twoInt[0]);
		}
		
		void addTransaction(Transaction transaction) {
			boolean success =  transactions.add(transaction);
			if(success) {
			     int count  =	Transaction.getCount();
			     Transaction.setCount(count+1);
			}
		}
		private int returnNine(){
			this.test = 6;
			return 9;
		}
		void showSummary() {
			System.out.println(transactions.size());
			for(Transaction transac : transactions) {
				System.out.println(transac);
			}
		}
		void showSpecificType(String type) {
			for(Transaction transac : transactions) {
					if(transac.getType().equals(type)) System.out.println(transac);
			}
		}

		String showSpecificType(int people) throws IllegalArgumentException, InterruptedException{
			return "";
		}

}
