package entities;

public class Account {
	private int numer;
	private String holder;
	private double balance;
	public Account(int numer, String holder) {
		this.numer = numer;
		this.holder = holder;
	}

	public Account(int numer, String holder, double initialDeposit) { 
		this.numer = numer;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getNumer() {
		return numer;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numer
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
