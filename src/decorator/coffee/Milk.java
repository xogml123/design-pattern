package decorator.coffee;

public class Milk extends CondimentDecorator{

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.description+" Adding Milk";
    }
}
