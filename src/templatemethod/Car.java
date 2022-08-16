package templatemethod;

public abstract class Car {

    public abstract void startCar();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

}
