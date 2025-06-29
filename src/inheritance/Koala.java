package inheritance;

public abstract class Koala extends Marsupial {
	abstract String toMySon();

	public Koala() {
		System.out.println(toMySon());
	}

	@Override
	String getSound() {
		return "koala koala";
	}

}
