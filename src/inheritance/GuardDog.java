package inheritance;
//2nd generation son
//Descendant of Dog
public class GuardDog extends Dog {
	int totalDogs = 5;
		int deadGD = 3;
		int age;
		public GuardDog(int age){
			super(5);
			this.age = age;
		}
		public GuardDog(double salary, int age, String name, String color){
			super();
			setSalary(salary);
			setAge(age);
			setAnimalName(name);
			setColor(color);
		}
		
		public void printInfo() {
			super.isForSale(true); 
			System.out.println("There are "+( super.totalDogs - this.deadGD )+" dogs that survive ");
		System.out.println("The dog is color "+getColor()+"\n"
				+ " and the name is "+getAnimalName()+". \n"
						+ " It's age is "+getAge()+"\n"
								+ " and has a salary of "+getSalary());
		}
}
