package pond.duck;

public class GoodDuckling extends MotherDuck{
	public void makeNoise() {
		var duck = new MotherDuck();
		//Call to default access method of mother
		duck.quack();
		//Direct call to the Class variable
		System.out.println(duck.noise);
	}
	public static void main(String[] args) {
		var a = new GoodDuckling();
		a.makeNoise();
	}
}
