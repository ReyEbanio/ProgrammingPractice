package inheritance;

public class Main {
	public static void main(String[] args) {
		GuardDog gd1 = new GuardDog(2383.8, 22, "Whity", "Black"); 
		gd1.setGender("Male");
		gd1.printInfo();
		System.out.println("The dog is "+ gd1.getGender());
		
		GuardDog gd2 = new GuardDog(2383.8, 22, "BLACKY", "WHITE");
		gd2.setGender("Male");
		gd2.printInfo();
		System.out.println("The dog is "+ gd2.getGender());
		
		
	}
}










