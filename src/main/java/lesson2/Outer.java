package lesson2;

public class Outer {
    private int var = 10;


    public static class Iner {
        Outer outer = new Outer();

        public void setVar(int var) {
            this.outer.var = var;
        }

        public int getVar() {
            return outer.var;
        }
    }
}