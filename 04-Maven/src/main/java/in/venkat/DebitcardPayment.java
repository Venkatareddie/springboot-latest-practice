package in.venkat;

public class DebitcardPayment implements IPayment {

	public DebitcardPayment() {
		System.out.println("Debitcard Payment::Constructor");
	}

	@Override
	public int pay() {
		System.out.println("Payment done through debit card....");
		return 1;
	}
	

}
