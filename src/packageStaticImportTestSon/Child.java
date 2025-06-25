package packageStaticImportTestSon;

import packageStaticImportTest.Parent;


public class Child {
	
	public static void main(String[] args) {
		//Parent a = new Parent(1997);
		System.out.println(Parent.phoneNumber);
		System.out.println(Parent.numberOfChild);
		System.out.println(Parent.phoneNumber);
	}
}
