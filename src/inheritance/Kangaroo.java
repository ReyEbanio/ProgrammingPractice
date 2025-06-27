package inheritance;

import java.io.FileNotFoundException;

public class Kangaroo extends Marsupial {
	
	public StringBuilder getName() {
		var sb = new StringBuilder();
		sb.append("reySon");
		return sb;
	}
	
	public void getAverageWeight() throws FileNotFoundException{
		
	}
	
	
	public void overLoadingMethod(int x, double y) {
		
	}
	
	public static void main(String[] args) {
	}
	
}
