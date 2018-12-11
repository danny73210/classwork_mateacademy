package lesson7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson();
        String str = null;

       /* try {
            Field field = lesson.getClass().getDeclaredField("str");
            field.setAccessible(true);
            str = (String) field.get(lesson);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

        System.out.println(str);

        try {
            lesson.print();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }*/

        try {
            lesson.getFile();
        } catch (MyException e) {
            System.out.println("Exception: no File");
            e.printStackTrace();
        }

        MyThread myThread = new MyThread(2000, "strThread1");
    }
}
