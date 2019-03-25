package BankAccountManager;

public class Savings extends Account {
	// List properties specific to a saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize saving account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	// List any methods specific to saving account
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: savings account");
		super.showInfo();
		System.out.println(
				"Your Saving Accont Features" + 
		"\n Safety Deposit box ID: " + safetyDepositBoxID +
		"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}

}
