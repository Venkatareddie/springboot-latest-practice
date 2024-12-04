package in.venkat;

public class Car {

	private IEngine engine;

	public Car() {
		System.out.println("Car::Constructor");

	}

	public Car(IEngine engine) {

		this.engine = engine;
	}

	public void drive() {
		int petrolEngine = engine.start();
		if (petrolEngine >= 1) {
			System.out.println("Journey Started...");
		} else {
			{
				System.out.println("Journey Not Started....");
			}
		}
	}

}
