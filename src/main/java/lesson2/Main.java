package lesson2;

public class Main {

    public static void main(String[] args) {
        Outer.Iner iner = new Outer.Iner();
        System.out.println(iner.getVar());
        iner.setVar(12);
        System.out.println(iner.getVar());

    }
}
