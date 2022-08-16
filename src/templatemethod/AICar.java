package templatemethod;

public class AICar extends Car {

    @Override
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println("자율주행으로 주행합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동으로 멈춤니다");
    }

    @Override
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
