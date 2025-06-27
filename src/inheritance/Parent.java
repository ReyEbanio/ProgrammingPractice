package inheritance;

public class Parent {
	{System.out.println("Parent class initializations");}
	static {
		System.out.println("Parent static initializations");
	}
	public Parent() {
		System.out.println("Parent Constructor ");
	}
	public Parent(int age) {
		System.out.println("Parent with Age");
	}

	/*
	 * private String name = "BestZoo"; {System.out.print(name + "-");} private
	 * static int COUNT = 0; static { System.out.print(COUNT + "-"); } static {
	 * COUNT += 10; System.out.print(COUNT + "-"); }
	 * 
	 * public Parent() { System.out.print("z-"); } public static void main(String[]
	 * args) { new Parent(); } //0-10-BestZoo-z- //z-BestZoo-0-10-
	 */
	
}
