package reviewChapter5;

public class BankRey {

	private String accountName;
	private double depositMoney;
	private double withdrawMoney;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getDepositMoney() {
		return depositMoney;
	}

	public void setDepositMoney(double depositMoney) {
		this.depositMoney = depositMoney;
	}

	public double getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(double withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	public void review5(String book) {

	}

	// Accessible only within the class
	private void getBankInfo() {
		System.out.println(choice);
	}

	// protected, accessible within the same package and subclasses
	protected void createBankAccount() {

	}

	public static void changePassword() {
		System.out.println("Change password");
	}

	public int addNumber(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private String choice = "Deposit";

	private void getDeposit() {
		System.out.println(choice);
	}
	//Default access
	void testPackageAccess() {
		System.out.println("been here");
		
	}
	//Protected
	protected String testProtected() {
		System.out.println("Protect daughter.");
		return "Yes";
	}
	
	protected String testProtected2() {
		testProtected();
		System.out.println("Protect daughter.");
		return "Yes";
	}
	
	public int addNumber(int... test) {
		return test[0] + test[1] + test[2];

	}

	public static void main(String[] args) {
		// var args declaration needs to be at the rightmost
		// two var args as parameter is does not compile
		
	}
}