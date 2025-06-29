package reviewChapter5;

public class MainBankReyCaller extends BankRey{
	
	public void callFatherProtected() {
		testProtected();
	}
	
	public static void main(String[] args) {
		BankRey pers1 = new BankRey();
		pers1.testPackageAccess();
		pers1.testProtected();
	}
}
