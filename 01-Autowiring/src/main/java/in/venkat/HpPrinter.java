package in.venkat;

public class HpPrinter implements IPrinter {

	public HpPrinter() {
		System.out.println("Hp Printer::Constructor");
	}

	@Override
	public void print() {
		System.out.println("Hp Printer.....Printed....");

	}

}
