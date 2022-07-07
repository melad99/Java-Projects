
package cartproject;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Observer> customers;
	private String message;
	private boolean changed;
	
	public Channel (){
		this.customers=new ArrayList<>();
	}
        
	@Override
	public void addCustomer(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");

		if(!customers.contains(obj)) customers.add(obj);

	}

	@Override
	public void removeCustomer(Observer obj) {

		customers.remove(obj);

	}

	@Override
	public void notifyCustomer() {
		List<Observer> observersLocal = null;
		
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.customers);
			this.changed=false;

		for (Observer obj : observersLocal) {
			obj.update();
		}

	}
	
	
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyCustomer();
	}
        
}