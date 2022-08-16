package observer;

public class DigitObserver implements Observer {

    private int observerState;
    @Override
    public void update(NumberGenerator generator) {
        observerState = generator.getNumber();
        render();
    }

    public void render() {
        System.out.println("DigitRender: " + observerState);
    }
}
