package lesson1;

public class matrix
{
    public static void main(String[] args)
    {

        int[][] arr = new int[4][3];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = (int) ((Math.random()*200)-100);

            }
        }

        matrix matrix = new matrix();
        matrix.matrixPrint(arr);
        matrix.finaMax(arr);
        matrix.ifMax(arr);
    }

    void matrixPrint(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void finaMax(int arr[][])
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max) max = arr[i][j];

            }
        }
        System.out.println();
        System.out.println("max" + max + "\n");

    }

    void ifMax(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] <= 0)
                {
                    System.out.print("*" + "\t");
                } else System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}

