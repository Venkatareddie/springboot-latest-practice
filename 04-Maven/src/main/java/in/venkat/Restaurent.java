package in.venkat;

public class Restaurent {
	private IPayment iPayment;

	public Restaurent() {
		System.out.println("Restaurent::Constructor...");
	}

	public Restaurent(IPayment iPayment) {

		this.iPayment = iPayment;
	}

	public void bill() {
		int pay = iPayment.pay();
		if (pay >= 1) {
			System.out.println("Payment Processed....");
		} else {
			System.out.println("Payment not processed...");
		}
	}

}
