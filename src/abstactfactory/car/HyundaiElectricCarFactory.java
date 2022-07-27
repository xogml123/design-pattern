package abstactfactory.car;

public class HyundaiElectricCarFactory extends CarFactory{
    public static final HyundaiElectricCarFactory INSTANCE = new HyundaiElectricCarFactory();

    private HyundaiElectricCarFactory() {

    }
    public static HyundaiElectricCarFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public Car produceCar(String name) {
        Car car ;
        if (name.equalsIgnoreCase(Car.SONATA)) {
            car = new ElectricSonata();
        } else if (name.equalsIgnoreCase(Car.GRANDEUR)) {
            car = new ElectricGrandeur();
        } else if (name.equalsIgnoreCase(Car.GENESIS)) {
            car = new ElectricGenesis();
        } else {
            car = new NoName();
        }
        return car;
    }
}
