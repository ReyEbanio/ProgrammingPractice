package inheritance;

public class Dog extends Animal {
	double salary;
	public Dog() {
		
	}
	public Dog(int age) {
		super.age = age;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAttributes(int age, String color, String animalName) {
		setAge(age);
		setAnimalName("Blackie");
		setColor("While");
	}

	public void bark() {
		System.out.println("The dog is barking.");
	}
}











