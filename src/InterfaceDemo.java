// refer the WhyDoWeNeedInterfaceDemo.java

interface Bank{
	void openCustomerAccount();
	void debitOperation();
	void creditOperation();
	void bankLedger();
	
}

class Icici implements Bank{
	public void openCustomerAccount() {
		System.out.println("ICICI Cust account created");
	}
	
	public void debitOperation() {
		System.out.println("ICICI account XXX debited $XX");
	}
	
	public void creditOperation() {
		System.out.println("ICICI account XXX credited $XX");
	}
	
	public void bankLedger() {
		System.out.println("ICICI Bank Ledger displayed here");
	}
	
	
}

class Sbi implements Bank{
	public void openCustomerAccount() {
		System.out.println("SBI Cust account created");
	}
	
	public void debitOperation() {
		System.out.println("SBI account XXX debited $XX");
	}
	
	public void creditOperation() {
		System.out.println("SBI account XXX credited $XX");
	}
	
	public void bankLedger() {
		System.out.println("SBI Bank Ledger displayed here");
	}
	
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Bank bk = new Icici();
		bk.openCustomerAccount();
		bk.creditOperation();
		
		bk = new Sbi();
		bk.debitOperation();
		bk.bankLedger();
	}

}
