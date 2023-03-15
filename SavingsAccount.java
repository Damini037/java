public class SavingsAccount{
   private static double annualInterestRate= 0.0;
   private double savingsBalance;
 
 public SavingsAccount(double savingsBalance){
 this.savingsBalance = savingsBalance;
 }
	
 public void calculateMonthlyInterest(){
    double monthlyInterestRate =annualInterestRate /12;
	double interest =savingsBalance * monthlyInterestRate;
	savingsBalance += interest;
 }
	
public static void modifyInterestRate( double newRate){
   
   annualInterestRate =newRate;
	 }

public static void main(String[] args){
    SavingsAccount saver1 = new SavingsAccount(2000.00);
	SavingsAccount saver2 = new SavingsAccount(3000.00);
	
	SavingsAccount.modifyInterestRate(0.04);
	
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
    System.out.println("Balance for saver1 after one month of 4% interest rate:"+saver1.savingsBalance);
	System.out.println("Balance for saver2 after one month of 4% interest rate:"+saver2.savingsBalance);
	
	SavingsAccount.modifyInterestRate(0.05);
	
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("Balance for saver1 after two months of 4% & 5% interest rate:"+saver1.savingsBalance);
	System.out.println("Balance for saver2 after two monthsof 4% & 5% interest rate:"+saver2.savingsBalance);
	}}
	