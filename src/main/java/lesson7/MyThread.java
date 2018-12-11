package lesson7;

public class MyThread extends Thread {
    long sleepMills;
    String strThread;

    @Override
    public void run() {
        System.out.println(strThread + " strated");
        try {
            Thread.sleep(sleepMills);
        } catch (InterruptedException e) {
            System.out.println("InterrptedException was occurred in " + strThread);
        }
        System.out.println(strThread + " finished");
    }

    public MyThread(long sleepMills, String strThread) {
        super(strThread);
        this.sleepMills = sleepMills;
        this.strThread = strThread;
    }
}
