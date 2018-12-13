package lesson8;

import java.util.concurrent.Callable;

public class MyThread implements Callable {
    private String name;
    private String str = "Hi from call thread";

    MyThread(String name)
    {
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        return str;

    }
}
