package decorator.coffee;

public class Mocha extends CondimentDecorator{

    public Mocha(Coffee coffee) {
        super(coffee);

    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Adding Mocha Syrup";
    }
}
