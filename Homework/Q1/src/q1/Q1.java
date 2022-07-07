
package q1;


public class Q1 {

    
    public static void main(String[] args) {
        SavingAccount saver1= new  SavingAccount(2000);
        SavingAccount  saver2= new SavingAccount(3000);      
 SavingAccount.modifyInterestRate(0.4);
 
        System.out.printf("the monthly interrest for saver1=%.2f $ \n the new balance for saver1"+"=%.3f $ \n",saver1.calculateMonthlyInterest(),saver1.getsavingsBalance());
 
 
    System.out.printf("the monthly interrest for saver2=%.2f $ \n the new balance for saver2"+"=%.3f $ \n",saver2.calculateMonthlyInterest(),saver2.getsavingsBalance());
 
        System.out.println("##########when  you set the annualInteretRare to 5%#####");
        SavingAccount.modifyInterestRate(.05);
           System.out.printf("the monthly interrest for saver1=%.2f $ \n the new balance for saver1"+"=%.3f $ \n",saver1.calculateMonthlyInterest(),saver1.getsavingsBalance());
   System.out.printf("the monthly interrest for saver2=%.2f $ \n the new balance for saver2"+"=%.3f $ \n",saver2.calculateMonthlyInterest(),saver2.getsavingsBalance());
 
    }
    
}
