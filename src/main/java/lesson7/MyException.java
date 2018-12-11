package lesson7;

import java.io.IOException;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
