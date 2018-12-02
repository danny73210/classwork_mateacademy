package lesson3;

public class Taxi extends Machine {

    @Override
    public void work() {
        System.out.println("Taxi driver is working!");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("I am driving yellow taxi");
    }
}
