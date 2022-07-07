
package cartproject;

public class Customer implements Observer {
	
	private String name;
	private Subject subject;
	
	public Customer (String nm){
		this.name=nm;
	}
        
	@Override
	public void update() {
                String msg = "new message";
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
                
	}

}
