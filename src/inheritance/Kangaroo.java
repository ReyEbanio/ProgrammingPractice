package inheritance;

import java.io.FileNotFoundException;

public class Kangaroo extends Marsupial {
	
	protected boolean isGising = true;
	@Override
	public String getSound() {
		return "Wooof";
	}
	@Override
	public String allSonMustHaveThisMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public StringBuilder getName() {
			var sb = new StringBuilder();
			sb.append("reySon");
			return sb;
	}
	
	public static void main(String[] args) {
		Kangaroo kang1 = new Kangaroo();
		Marsupial mar1 = kang1;
		Marsupial mar2 = kang1;
		
		kang1.overLoadingMethod(5, 5.0);
		
		System.out.println(kang1.isGising);
		System.out.println(mar1.isGising);
		
	}
	public  void overLoadingMethod(int x, double y) {
		
	}
	
	@Override
	public void getAverageWeight() throws FileNotFoundException{
		
	}
	
	private void testOnSon() {
		System.out.println("TestOnSonPrivate");
	}
	//method hiding if its static and it is overriding the parent class
	public static void testOnHidingMethods() {
		System.out.println("Son copy of static method from parent");
	}

	

}











