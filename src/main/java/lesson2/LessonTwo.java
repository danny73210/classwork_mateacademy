package lesson2;

public class LessonTwo {
    int age;
    int weight;
    String name;

    LessonTwo(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    LessonTwo(String name) {
        this(0, 3500, name);
    }

    public static void main(String[] args) {
        Access access = new Access();
        System.out.println("getting");
        System.out.println(access.a);
        System.out.println(access.d);
        System.out.println(access.c);
        System.out.println(access.getB());
        System.out.println("updating * 10");
        System.out.println(access.a = access.a * 10);
        System.out.println(access.a = access.d * 10);
        System.out.println(access.a = access.c * 10);
        access.setB(access.getB()*10);
        System.out.println(access.getB());



    }
}
