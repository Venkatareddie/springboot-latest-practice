package in.venkat;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("Sony Printer::Constructor");
	}

	@Override
	public void print() {
		System.out.println("Sony Printer....Printed...");

	}

}
