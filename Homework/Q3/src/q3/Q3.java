/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;


public class Q3 {

    
    public static void main(String[] args) {
          Customer n=new Customer (10,"melad",4);
       Invoice m =new Invoice(123,n,10000);
        System.out.println(m.getCustomerName());
        System.out.println("amount after discount ");
        System.out.println(m.getamountAfterDiscount()+"$");
        System.out.println(n.toString());
    }
    
}
