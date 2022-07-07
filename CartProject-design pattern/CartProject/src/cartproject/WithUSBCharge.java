
package cartproject;


public class WithUSBCharge extends PackDecorator {

    public WithUSBCharge(Backpack newBackpack) {
        super(newBackpack);
    }

    public String preparePack() {
        return super.preparePack() + " With USB Charge ";
    }

    public double packPrice() {
        return super.packPrice() + 200.0;
    }
}
