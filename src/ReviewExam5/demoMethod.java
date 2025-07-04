package ReviewExam5;

public class demoMethod {
	
	public final Integer demoMethod(String s) throws NumberFormatException{
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		final int a = 5;
		
		demoMethod i = new demoMethod();
		
		i.choose(1, "hello", "world", "john");
	}

	public String choose(Integer i, String... s) {
		return s[i];
	}
	
	Integer compute(Integer a, Integer b) {
		Integer c = 5;
		return a + b + c;
	}
	
}
