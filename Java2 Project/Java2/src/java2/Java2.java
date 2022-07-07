
package java2;

public class Java2 {

    
    public static void main(String[] args) {
        Admin s = new Admin();
        s.addEmployee(new Teacher("1" , "ali"));
        s.addEmployee(new Student("2" , "ahmed" , "ggg"));    
      
        s.Start();       

    }
    
}
