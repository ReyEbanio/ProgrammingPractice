package packageStaticImportTest;

import java.time.LocalDate;

public class Parent {
	 static int globalKey = 5;
	public static int phoneNumber = 1234;
	protected static String myNumber = "0921341234";
	public static int numberOfChild = 5;
	
	Parent(int year) {
		var date = LocalDate.now();
		int yearNow = date.getYear();
		int age = yearNow - year;
		System.out.println(age);
	}
	
	public static int juggle(boolean a, boolean...b) {
		return b.length; 
	}
	
	public static void main(String[] args) {
		int a = juggle(true,new boolean[2]);
		System.out.println(a);
	}
	
}
