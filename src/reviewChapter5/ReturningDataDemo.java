package reviewChapter5;

public class ReturningDataDemo {
	public static void main(String[] args) {
		String capitalName = capitalName("Rey");
		System.out.println("Original: "+capitalName);
	}
	
	public static String capitalName(String name) {
		String originalString = name;
		String copyOfString = originalString.toUpperCase();
		System.out.println("Passed value is :"+originalString);
		return copyOfString;
	}
	
}
