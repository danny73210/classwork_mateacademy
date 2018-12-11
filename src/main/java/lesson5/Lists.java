package lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//считовать чаще arraylist чаще добавлять linkedlist
public class Lists {

    public static void main(String[] args) {
        Lists lists = new Lists();

        long time = lists.start() - lists.finish();
        String string = "string";

        ArrayList<String> arrayListrrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println();


        long s1 = lists.start();
        for (int i = 0; i < 90000; ++i) {
            arrayListrrayList.add(i / 2, string);
        }
        long f1 = lists.finish();
        long super1 = f1 - s1;
        System.out.println("arraylist time : " + super1);

        long s2 = lists.start();
        for (int i = 0; i < 90000; ++i) {
            linkedList.add(i / 2, string);
        }
        long f2 = lists.finish();
        long super2 = f2 - s2;
        System.out.println("linkedList time : " + super2);
    }

    public long start() {
        return System.currentTimeMillis();
    }

    public long finish() {
        return System.currentTimeMillis();
    }
}
