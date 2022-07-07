
package cartproject;


public class PlainBackpack implements Backpack{

    @Override
    public String preparePack() {
        return "main Pack";
    }

    @Override
    public double packPrice() {
        return 50.0;
    }
    
}
