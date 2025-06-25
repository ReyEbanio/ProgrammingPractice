package reviewChapter5;

public class OverloadedMethodSelectionDemo {
	public String demoOverloadedByReference(String s) {
		return "String" + s;
	}
	
	public String demoOverloadedByReference(Object o) {
		return "Object"+o;
	}
	
	public String demoOverloadedByPrimitive(int i) {
		return "int: "+i;
	}
	
	public String demoOverloadedByPrimitive(long l) {
		return "long: "+l;
	}
	
	public String demoOverloadedByAutoboxing(int i) {
		return "AB, int: "+i;
	}
	
	public String demoOverloadedByAutoboxing(Integer i) {
		return "AB, Integer: "+i;
	}
	
	public String demoOverloadedByArray(int[] i) {
		return "Integer arrays"+i[0];
	}
	
	public String demoOverloadedByArray(Integer[] i) {
		return "Integer arrays"+i[0];
	}
	
	public String demoOverloadedByVarArgs(int[]...i) {
		return "VarArgs int"+i[0];
	}
	
	public String demoOverloadedByVarArgs(Integer[]...i) {
		return "VarArgs Integers"+i[0];
	}
	
	
}





















