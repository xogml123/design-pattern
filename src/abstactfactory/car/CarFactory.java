package abstactfactory.car;

public abstract class CarFactory {

    public static final String HYUNDAI_ELECTRIC = "hyundai_electric";
    public static final String HYUNDAI = "hyundai";

    public abstract Car produceCar(String name);
}
