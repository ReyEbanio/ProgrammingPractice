package inheritance;

public class CuttleFish {
		
	private String name = "Swimmy";
	{System.out.print(name);}
	private static int COUNT = 0;
	static {
		System.out.print(COUNT);
	}
	{COUNT++; System.out.print(COUNT);}
	
	public CuttleFish() {
		System.out.print("Constructor");
	}
	public static void main(String[] args) {
		System.out.print("Ready");
		new CuttleFish();
	}
	//0ReadySwimmy1Constructor
}
