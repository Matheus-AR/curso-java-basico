package exerciciosfixacao.entities;

public class Account {
	private String name;
	private String number;
	private double balance;
	
	public Account(String number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(String number, String name) {
		this.number = number;
		this.name = name;
		this.balance = 0.0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String number() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	

	public void toWithdraw(double value) {
		double rate = 5.0;
		this.balance -= value + rate;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
