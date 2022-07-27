package abstactfactory.car;

public class CarFactoryProducer {

    private static final CarFactoryProducer instance = new CarFactoryProducer();

    private CarFactoryProducer() {
    }

    public static CarFactoryProducer getInstance() {
        return instance;
    }

    public CarFactory produceFactory(String name) {
        if (CarFactory.HYUNDAI_ELECTRIC.equals(name)) {
            return HyundaiElectricCarFactory.getInstance();
        } else if (CarFactory.HYUNDAI.equals(name)) {
            return HyundaiCarFactory.getInstance();
        } else {
            return null;
        }
    }

}
