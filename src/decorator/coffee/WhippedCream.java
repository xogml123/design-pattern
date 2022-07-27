package decorator.coffee;

public class WhippedCream extends CondimentDecorator {

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.description + " AddingWhipped Cream";
    }

}

