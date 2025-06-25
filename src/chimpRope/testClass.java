package chimpRope;

import java.util.HashMap;

public class testClass {
	public static void main(String[] args) {
		process("sdoskdlsss");
	}

	public static void process(String input) {
		String str = "sdoskdlsss";
		HashMap<Character, Integer> uniqueCharCount = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
				uniqueCharCount.put(ch, uniqueCharCount.getOrDefault(ch, 0) + 1);
			}
		System.out.println(uniqueCharCount);
		
	}
}
