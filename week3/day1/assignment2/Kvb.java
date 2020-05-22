package week3.day1.assignment2;

public class Kvb extends Rbi{

	public void loadInterestRate(String persoanlLoan) {
		System.out.println("Personal Loan Interest rate is: "+persoanlLoan);

	}
	public static void main(String[] args) {
		Kvb obj = new Kvb();
		obj.loanInterestRate();
		obj.loanInterestRate("6%");
		obj.loadInterestRate("8%");

	}

}
