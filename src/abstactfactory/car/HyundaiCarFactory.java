package abstactfactory.car;

public class HyundaiCarFactory extends CarFactory{

    public static final HyundaiCarFactory INSTANCE = new HyundaiCarFactory();

    private HyundaiCarFactory() {

    }
    public static HyundaiCarFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public Car produceCar(String name) {
        Car car = null;
        if (name.equalsIgnoreCase(Car.SONATA)) {
            car = new Sonata();
        } else if (name.equalsIgnoreCase(Car.GRANDEUR)) {
            car = new Grandeur();
        } else if (name.equalsIgnoreCase(Car.GENESIS)) {
            car = new Genesis();
        } else {
            throw new IllegalStateException();
        }
        return car;
    }
}
