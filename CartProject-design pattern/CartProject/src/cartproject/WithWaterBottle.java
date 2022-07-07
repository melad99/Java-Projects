package cartproject;

public class WithWaterBottle extends PackDecorator {

    public WithWaterBottle(Backpack newBackpack) {
        super(newBackpack);
    }

    public String preparePack() {
        return super.preparePack() + " With Water Bottle ";
    }

    public double packPrice() {
        return super.packPrice() + 50.0;
    }
}
