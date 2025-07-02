



package inheritance;

public class Son extends Parent{
	
	public  void makeNoise() {
		System.out.println("Test Call.");
		meowMeow();
		
	}
	
	public static void main(String[] args) {
		new Son().makeNoise();
	}
	
}
