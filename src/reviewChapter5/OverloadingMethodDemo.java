package reviewChapter5;

public class OverloadingMethodDemo {
	public void demoOverloadingMethod() {
		String s = "";
	}
	
	public String appendToString(String s) {
		s += "Hi, how are you.";
		return s;
	}
	
	public String appendToString(String s, String b) {
		s += "Hi, how are you.";
		b += "What is your name?";
		return s+=b;
	}
	
}
