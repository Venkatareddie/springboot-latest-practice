package in.venkat;

public class Singleton implements Cloneable {

	private static Singleton instanceSingleton = null;

	public Singleton() {

	}

	public static Singleton objSingleton() {

		if (instanceSingleton == null) {
			instanceSingleton = new Singleton();
		}

		return instanceSingleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return new CloneNotSupportedException("You cannot clone the object");
	}

}
