package in.venkat;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton singleton=new Singleton();
		System.out.println(singleton.objSingleton());
		Singleton singleton1=new Singleton();
		System.out.println(singleton1.objSingleton());
		Singleton singleton2=new Singleton();
		System.out.println(singleton2.clone());

	}

}
