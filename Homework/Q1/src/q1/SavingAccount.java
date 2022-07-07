
package q1;


public class SavingAccount {
       static double annualInterestRate=0;
    private double savingsBalance;
    public SavingAccount( double savingsBalance){
        this.savingsBalance= savingsBalance;
    }
    public double calculateMonthlyInterest(){
        double monthlyAmount =(savingsBalance*annualInterestRate )/12;
      savingsBalance+= monthlyAmount;
        return monthlyAmount;
       
    }
    public double getsavingsBalance(){
        return savingsBalance;
    }
    public static void modifyInterestRate(double modified){
       annualInterestRate = modified;
}
}