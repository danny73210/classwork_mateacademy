package lesson1;

public class recursion
{
    public static void main(String[] args) {
        recursion recursion = new recursion();
        System.out.println(recursion.factFind(3));
    }

    int factFind(int x)
    {
        if(x==1) return 1;
        int result = 0;
        result = factFind(x-1)*x;
        return result;
    }
}
