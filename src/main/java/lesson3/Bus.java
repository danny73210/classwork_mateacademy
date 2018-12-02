package lesson3;

public class Bus extends Machine {

    @Override
    public void drive() {
        super.drive();
        System.out.println("I am driving red bus");
    }

    @Override
    public void work() {
        System.out.println("Bus driver is working!");
    }
}
