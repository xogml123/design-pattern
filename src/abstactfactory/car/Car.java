package abstactfactory.car;

public abstract class Car {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    String productName;

    protected Car(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }
}