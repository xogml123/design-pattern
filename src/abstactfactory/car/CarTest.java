package abstactfactory.car;

public class CarTest {
    public static void main(String[] args) {
        CarFactoryProducer carFactoryProducer = CarFactoryProducer.getInstance();
        CarFactory hyundaiCarFactory = carFactoryProducer.produceFactory(CarFactory.HYUNDAI);
        CarFactory hyundaiElectricCarFactory = carFactoryProducer.produceFactory(CarFactory.HYUNDAI_ELECTRIC);

        Car sonata = hyundaiCarFactory.produceCar(Car.SONATA);
        System.out.println(sonata.toString());
        Car genesis = hyundaiCarFactory.produceCar(Car.GENESIS);
        System.out.println(genesis.toString());
        Car grandeur = hyundaiCarFactory.produceCar(Car.GRANDEUR);
        System.out.println(grandeur.toString());

        Car electricSonata = hyundaiElectricCarFactory.produceCar("Sonata");
        System.out.println(electricSonata.toString());
        Car electricGenesis = hyundaiElectricCarFactory.produceCar(Car.GENESIS);
        System.out.println(electricGenesis.toString());
        Car electricGrandeur = hyundaiElectricCarFactory.produceCar(Car.GRANDEUR);
        System.out.println(electricGrandeur.toString());

    }
}