package lesson3;

public abstract class Machine {
    private boolean wasStarted;

    public boolean start() {
        wasStarted = true;
        return true;
    }

    public boolean stop() {
        wasStarted = false;
        return false;
    }

    public abstract void work();

    public void drive(){
        System.out.println("i am driving the car");
    }
}
