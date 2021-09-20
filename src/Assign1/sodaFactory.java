package Assign1;

public class sodaFactory implements bottleFactory {

    @Override
    public bottle createBottleA() {
        soda pepsi = new soda("Pepsi");
        pepsi.setPrice();
        return pepsi;
    }

    @Override
    public bottle createBottleB() {
        soda fanta = new soda("Fanta");
        fanta.setPrice();
        return fanta;
    }
}
