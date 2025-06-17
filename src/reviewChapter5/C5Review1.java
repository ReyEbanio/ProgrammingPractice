package reviewChapter5;

public class C5Review1 {
	
	public static void main(String[] args) {
		testPrivate();
	}
	 public static void getTask(String s, int a) {
		System.out.println("You are in getTask");
	}
	 
	 public static void getTask(int b, String sb) {
		 System.out.println("getTask 2");
	 }
	 
	private static void testPrivate() {
		System.out.println("testPrivate");
	}
}
