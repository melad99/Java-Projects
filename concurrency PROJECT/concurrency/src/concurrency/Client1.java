package concurrency;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client1 implements Runnable {

    Syn s;
    String str = "File Handling in Java using "+" FileWriter and FileReader Class A";
    
    public Client1(Syn s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {

            s.write(str);
            s.print(5);
            s.add(10, 5);
            s.Subtract(10, 5);
            s.multiply(10, 5);
            s.division(10, 5);

        }catch (IOException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

}
