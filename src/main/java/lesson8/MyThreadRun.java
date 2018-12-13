package lesson8;

public class MyThreadRun implements Runnable {
    private String name;
    MyThreadRun(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Hi from run thread");
    }
}
