package reviewChapter5;

public class AutoboxingAndUnboxing {
	public static void demoAutoboxingAndUnboxing(int num1) {
		//Autoboxing
		Integer num2 = num1;
		
		//Unboxing
		int num3 = num2;
		
		//Numeric promotion
		long num4 = num3;
		
		//Not permitted, autoboxing and numeric promotion
		//Long num5 = num1;
		//But can be done explicitly by casting
		Long num5 = (long) num1;
	}
}
