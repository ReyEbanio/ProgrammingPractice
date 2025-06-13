








package review;
 class MutableImmutable {
	public static void main(String[]args) {
		
		//Immutable String, LocalDate, Integer
		String test = "Test";
		//Doesn't execute because its immutable
		test.toUpperCase();
		test.concat("1");
		//Needs to be reassigned to execute
		//test = test.toUpperCase();
		//test = test.concat("1");
		
		//Mutable StringBuilder, StringBuffer, ArrayList
		StringBuilder sb = new StringBuilder("Test"); 
		//Execute and doesn't to be reassigned
		sb.append("1");
		
		System.out.println(test+ "  "+sb);
	}
}
