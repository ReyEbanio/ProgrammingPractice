package inheritance;

//3rd gen from Marsupial, son of Kangaroo
public class SonKoala extends Koala {
	@Override
	public String allSonMustHaveThisMethod() {
		return "Yes Grand Class";
	}
	@Override
	String toMySon() {
		return "yes father";
	}
	public static void main(String[] args) {
		new SonKoala();
	}
}
