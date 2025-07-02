package reviewChapter5;

public class  Girrafe {
	public void eat(Girrafe g) {
		allGiraffeComeOut();
		drink();
		g.eat(g);
	}
	public void drink() {}
	public static void allGiraffeGoHome(Girrafe g) {
		allGiraffeComeOut();
		g.eat(g);
	}
	public static void allGiraffeComeOut() {
		//drink();
	}
}
