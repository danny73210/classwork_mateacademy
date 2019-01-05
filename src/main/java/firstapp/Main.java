package firstapp;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String path = "newFile.json";
        System.out.println("hello maven again");
        User user = new User();
        System.out.println(user.toString());
        JsonUtility jsonUtility = new JsonUtility();
        jsonUtility.printUserToFile(user, path);
    }
}
