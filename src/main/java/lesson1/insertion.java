package lesson1;

public class insertion
{
    public static void main(String[] args)
    {
        insertion insertion =  new insertion();
        int [] array = {5, 3, 2, 8, 3, 6};
        insertion.insertionSort(array);
        insertion.printSort(array);
    }

    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void printSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }

    }
}
