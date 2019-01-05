package firstapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JsonUtility {

    public static void printUserToFile(User user, String path) throws JsonProcessingException {
        File file = new File(path);

        ObjectMapper objectMapper = new ObjectMapper();

        String content = objectMapper.writeValueAsString(user);

        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
