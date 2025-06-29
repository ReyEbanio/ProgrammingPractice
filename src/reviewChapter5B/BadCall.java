package reviewChapter5B;

import reviewChapter5.BankRey;

public class BadCall {
	public void testCallOnImportMethod() {
			BankRey b1  = new BankRey();
	}
	
}
/*
																							private 			package 			protected 			public
the same class																	Yes					Yes						Yes						Yes
another class in the same package								No																			Yes
a subclass in a different package									No												Yes						Yes	
an unrelated class in a different package					No												No						Yes


*/