package in.venkat;

public class Car {
	
	private Engine engine;

	public Car() {
		System.out.println("Car::Constructor");
	}
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}


	public void drive()
	{
		int status=engine.start();
		if(status>1)
		{
			System.out.println("Journey started...");
		}
		else {
			System.out.println("Journey not started...");
		}
	}
	

}
