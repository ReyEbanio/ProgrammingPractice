package inheritance;

import java.io.IOException;

abstract public class  Marsupial {
	  abstract String getSound();
	  abstract String allSonMustHaveThisMethod();
	  
	  
	public void bar() {
		System.out.println(getSound());
	}
	protected boolean isGising = false;
	
	public final void cantChangeMe() {
		
	}
	
	//overriding methods
	public void getAverageWeight() throws IOException{

	}
	public CharSequence getName() {
		return "rey";
	}
	//overloading methods
	public void overLoadingMethod(int x) {
	
	}
private void testOnSon() {
		System.out.println("What");
	}
	public static void testOnHidingMethods() {
		System.out.println("Parent original static method.");
	}
	public static void main(String[] args) {
		testOnHidingMethods();
	}
}
