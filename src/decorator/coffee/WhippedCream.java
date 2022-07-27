package decorator.coffee;

public class WhippedCream extends CondimentDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);

    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " AddingWhipped Cream";
    }

}

