
package reviewChapter5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ActivityTask {
	
	volatile boolean married;
	final transient String password = "pas123";
	public static void main(String[] args) {
//		try {
//			int a = demoMethodDesign("C:\\Users\\ReyC\\Downloads\\download.htm");
//			System.out.println(a);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		demoVarargs("Wife", "Nando", "Jeha", "Bratata", "Jann");
	}
	
	public static void feedChickenFighter() {
		int bakunaPrice = 2500;
		int feedsPrice = 5000;
	}
	
	private static void budgetForChickenFight() {
		int pustaFight = 10000;
	}
	
	protected static void chickenFightEvent() {
	   int registrationFor1V1 = 1500;
	   System.out.println(registrationFor1V1);
	}
	
	static void betOnChickenFight() {
		int sugalMoney = 150000;
	}
	
	public static void demoVarargs(String wife, String...kids) {
		System.out.println("Hello "+wife+" your 2nd son is "+kids[1]);
		
		System.out.println("Here are the names of your kids:");
		for(String kid : kids) {
			System.out.println(kid);
		}
		
	}
	
	
	public static void demoLocalVariableModifier() {
		final String gender = "male";
		
	}
	
	public static void demoEffectivelyFinal() {
		final String firstName = "Jorge";
	}
	
	public static Integer demoMethodDesign(String path) throws IOException{
		
		Integer fileSize = 0;
		File f = new File(path);
		
		try(FileInputStream fileInput = new FileInputStream(f)){
				fileSize = fileInput.available();
				}catch(Exception e) {
					fileSize = 0;
				}
		
		return fileSize;
	}
}
