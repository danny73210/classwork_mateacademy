package lesson1;

public class sort
{
    public static void main(String[] args)
    {
        sort sort = new sort();
        int [] array = {24, 10, 34, 90, 52};
        sort.bubbleSort(array);
        sort.printArray(array);

    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    temp = arr[j];
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    
}
