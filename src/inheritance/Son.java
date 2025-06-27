package inheritance;

public class Son extends Parent{
	{System.out.println("Son class initialization");}
	static {
		System.out.println("Son static initialization");
	}
	public Son() {
		System.out.println("Son constructor");
	}
	public Son(int birthday) {
		System.out.println("Son with birthday");
	}
	public Son(int birthday, String name) {
		super(5);
		System.out.println("Son birthday, name");
	}
}
