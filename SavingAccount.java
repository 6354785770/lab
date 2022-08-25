class SavingAccount{
	public static double annualInterestRate;
	private double savingsBalance;
	public double monthlyInterest;

	public void calculateMonthlyInterest(){
		monthlyInterest = this.savingsBalance*this.annualInterestRate/12.0;
		savingsBalance += monthlyInterest;
	}

	public SavingAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public void getsavingsBalance(){
		System.out.println("And the new saving balance is "+ this.savingsBalance);
	}

}

public class Que03{

	public static void main(String args[]){

		//With annual interest rate of 4% for both the saver
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);
		SavingAccount.annualInterestRate = 4;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("For saver1 the monthly interest is "+saver1.monthlyInterest);
		saver1.getsavingsBalance();
		System.out.println("For saver2 the monthly interest is "+saver2.monthlyInterest);
		saver2.getsavingsBalance();

		//With annual interest rate of 5% for both the saver
		SavingAccount.annualInterestRate = 5;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("For saver1 the upgraded monthly interest is "+saver1.monthlyInterest);
		saver1.getsavingsBalance();
		System.out.println("For saver2 the upgraded monthly interest is "+saver2.monthlyInterest);
		saver2.getsavingsBalance();


	}
}