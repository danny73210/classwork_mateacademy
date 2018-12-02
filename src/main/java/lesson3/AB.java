package lesson3;

public class AB implements A, B {
    public static void main(String[] args) {

    }
    @Override
    public void print() {
        B.super.print();
    }
}
