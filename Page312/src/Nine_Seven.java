import java.util.Date;

public class Nine_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account newAccount1 = new Account(1122, 20000);
		newAccount1.setAnnualInterestRate(4.5);
		newAccount1.withDraw(2500);
		newAccount1.deposit(3000);
		
		System.out.println("The balance is: " + newAccount1.getBalance());
		System.out.println("The monthly interest rate is: " + newAccount1.getMonthlyInterestRate() + "%");
		System.out.println("The date created is: " + newAccount1.getDateFun());
	}

}

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		id++;
		dateCreated = new Date();
	}
	
	public Account(int newId, double newBbalance) {
		id = newId;
		balance = newBbalance;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBbalance) {
		balance = newBbalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public Date getDateFun() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return (balance * (annualInterestRate / 100)) / 12;
	}
	
	public void withDraw(double moneyWithDrawed) {
		balance -= moneyWithDrawed;
	}
	
	public void deposit(double moneydeposited) {
		balance += moneydeposited;
	}
}