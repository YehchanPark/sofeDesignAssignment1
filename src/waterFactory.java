public class waterFactory implements bottleFactory {
    @Override
    public bottle createBottleA() {
        water dasani = new water("Dasani");
        dasani.setPrice();
        return dasani;
    }

    @Override
    public bottle createBottleB() {
        water smart = new water("Smart");
        smart.setPrice();
        return smart;
    }
}
