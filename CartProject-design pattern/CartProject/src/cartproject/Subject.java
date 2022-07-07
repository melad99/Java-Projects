
package cartproject;


public interface Subject {

	public void addCustomer(Observer obj);
	public void removeCustomer(Observer obj);
	public void notifyCustomer();
	
}
