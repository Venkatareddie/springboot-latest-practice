package in.venkat;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("Petrol Engine::Constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine Started...");
		return 1;
	}

}
