package decorator.coffee;

public class Milk extends CondimentDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Adding Milk";
    }
}
