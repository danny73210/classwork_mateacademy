package lesson1;

import java.io.*;

public class workingWithFile
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("HelloWorld.txt");
        FileOutputStream fos = null;
        fos = new FileOutputStream(file);

        fos.write("Hello World!".getBytes());
        fos.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = bufferedReader.readLine();
        System.out.println(line);
    }
}
