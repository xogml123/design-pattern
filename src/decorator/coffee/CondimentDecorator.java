package decorator.coffee;

public abstract class CondimentDecorator extends Coffee {

    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getDescription();

}
