
package cartproject;


public class WithLaptopSlot extends PackDecorator{
    
    public WithLaptopSlot(Backpack newBackpack) {
        super(newBackpack);
    }
    
    public String preparePack() {
        return super.preparePack() + " With Laptop Slot ";
    }

    public double packPrice() {
        return super.packPrice() + 150.0;
    } 
}
