package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class Lesson {
    private String str = null;

    public void setStr(String str) {
        this.str = str;
    }

    void print() throws NullPointerException {
        System.out.println(str);
    }

    void getFile() throws MyException {
        String fileName = "not_existed_file.txt";
        try{
            FileReader fileReader = new FileReader(fileName);
            fileReader.read();
        } catch (IOException ex) {
            throw new MyException("Cannot open file " + fileName, ex);
        }
    }
}
