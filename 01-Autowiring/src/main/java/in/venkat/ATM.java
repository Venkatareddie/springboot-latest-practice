package in.venkat;

public class ATM {
	
	private IPrinter iPrinter;

	public void setiPrinter(IPrinter iPrinter) {
		this.iPrinter = iPrinter;
	}
	
	public void withdraw()
	{
		System.out.println("Amount winthdrw successfully...");
		iPrinter.print();
	}
	
	

}
