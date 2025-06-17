package reviewChapter4;

import java.util.Arrays;

public class SortingBehaviour {
	public static void main(String[] args) {
		
		String [] test1 = {"ab3"};
		String [] test2 = {"ab3"};
		//-3
	//	System.out.println(Arrays.compare(test1, test2));
		
	     String escaped = "Line1\\nLine2\\tTabbed"; //stays the same when printed
	     String processed = escaped.translateEscapes();
	     
	     System.out.println(escaped);
	     System.out.println(processed);
		//Line1\
	     //Line2\	Tabbed
	     
		//Line1
	     //Line2 Tabbed
	     
	     String raw = "\t This is a\n multi-line comment.\n";
	     //Indent is executed first then strip before executing values of backslash
	     String cleaned = raw.indent(1).strip();
	     System.out.println("Q12: " + cleaned.substring(0, 12));
	     // This is a
	     // multi-line comment.
	     //
	     
	     //This is a
	     
	}
}
