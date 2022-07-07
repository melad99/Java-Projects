/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author M.s
 */
public class Invoice {
        private int id;
      private Customer Customer0;
       private double amount;
 public  Invoice(int id, Customer customer0,double amount)   {
     this.id= id;
     this.amount= amount;
     this.Customer0 = customer0;
 }  

    public int getid() {
        return id;
    }
    
    public void setamount(double amount ){
        this.amount=amount;
    }
    public double getamount(){
        return amount;
    }

   public void setCustomer(Customer customer0) {
        this.Customer0 = customer0;
        
    }
    

    public Customer getCustomer() {
        return Customer0;
    }

    
 public String getCustomerName(){
     return  Customer0.getName();
     
 }
 public double getamountAfterDiscount(){
     return amount- ((double)Customer0.getDiscount()/100)*amount;
 }
}
