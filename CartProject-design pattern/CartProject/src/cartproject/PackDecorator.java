
package cartproject;


public class PackDecorator implements Backpack {

    private Backpack newBackpack;

    public PackDecorator(Backpack newBackpack) {
        this.newBackpack = newBackpack;
    }

    @Override
    public String preparePack() {
        return newBackpack.preparePack();
    }

    @Override
    public double packPrice() {
        return newBackpack.packPrice();
    }

}
