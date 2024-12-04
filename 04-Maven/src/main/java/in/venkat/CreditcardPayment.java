package in.venkat;

public class CreditcardPayment implements IPayment {

	public CreditcardPayment() {
		System.out.println("Creditcard Payment::Constructor");
	}

	@Override
	public int pay() {
		System.out.println("Payment done through credit card...");
		return 1;
	}

}
