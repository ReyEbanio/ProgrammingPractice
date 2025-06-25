package reviewChapter5;

import static java.lang.Math.round;

public class StaticDataDemo {
	public static String name = "";
	static double minutesOfCall = 5.44;
	static int numberOfCalls;
	static {
		numberOfCalls = 10;
	}

	public static void roundANumber() {
		// static import will get rid of the requirement to call
		// Math.round to instead directly round.
		int a = (int) round(3.6);
	}
	
	public static void showMinutesOfCall() {
		System.out.println(round(minutesOfCall));
	}
	
	public static void main(String[] args) {
		System.out.println(numberOfCalls);
	}
	
}
