package zooAnimalC5;

public class Animal {
	//instance variable
	String animalType;
	final String animalName;
	{System.out.println("Class");}
	
	public Animal() {
		System.out.println("Constructor");
		animalName = "Alfred";
	}
	
	public static void main(String[] args) {
		//local variable
		
		System.out.println("Main");
		final String ostrichType = "UnflyingBird";
		final String[] unflyingBirds = new String[4];
		unflyingBirds[0] = "Ostrich";
		unflyingBirds[1] = "Chicken";
		
		
		
		Animal a = new Animal();
		a.setAnimalType(ostrichType);
		a.animalType = "";
		
	}
	
	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	
}
