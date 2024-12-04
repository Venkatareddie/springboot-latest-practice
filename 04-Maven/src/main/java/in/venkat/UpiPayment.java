package in.venkat;

public class UpiPayment implements IPayment {

	public UpiPayment() {
		System.out.println("UPI Payemnt::Constructor...");
	}

	@Override
	public int pay() {
		System.out.println("Paymenyt done through UPI...");
		return 1;
	}

}
