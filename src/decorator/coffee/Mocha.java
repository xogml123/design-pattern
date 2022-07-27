package decorator.coffee;

public class Mocha extends CondimentDecorator{

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.description + " Adding Mocha Syrup";
    }
}
