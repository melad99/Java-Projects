

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

        try {
            Cal obj = (Cal) Naming.lookup("rmi");
            obj.GUI();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
