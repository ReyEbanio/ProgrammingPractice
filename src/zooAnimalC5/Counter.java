package zooAnimalC5;

public class Counter {
	public static String glide(String s) {
		return "1";
	}
	
	public static String glide(String...s ) {
		return "2";
	}
	public static String glide(Object o) {
		return "3";
	}
	
	public static String glide(String s, String t) {
		return "4";
	}
	
	public static void main(String[] args) {
		
		System.out.println(glide("a"));
		System.out.println(glide("a", "b"));
		System.out.println(glide("a","b","c"));
		//142
	}
	
	//long
	//-
	//long
	
	/*
	 * public static int count; public static void addGorilla() {count++;} public
	 * void babyGorilla() {count++;}
	 * 
	 * public void anounceBabies() { addGorilla(); babyGorilla(); }
	 * 
	 * public void announcedBabiesToEveryone() { addGorilla(); babyGorilla(); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * }
	 */
}
