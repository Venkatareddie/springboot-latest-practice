package in.venkat;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("Diesel Engine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("Diesel Engine Started...");
		return 1;
	}

}
