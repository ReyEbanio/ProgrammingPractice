package inheritance;

public class GrandSon extends Son {
	static {
		System.out.println("GrandSon static initialization");
	}
	{System.out.println("GrandSon class initialization");}

	public GrandSon() {
		super();
		System.out.println("GrandSon Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Inside main method of before new instance of GrandSon");
		new GrandSon();
		System.out.println("Inside main method after new instance of GrandSon");
	}
	
}






