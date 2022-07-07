

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try {
            Cal obj = new CalTest();
        
            Naming.rebind("rmi", obj);
            System.out.println("Server ready");
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
