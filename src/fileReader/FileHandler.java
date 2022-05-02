package fileReader;

import com.google.gson.Gson;
import testClasses.Human;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class FileHandler {


    public static String readFile(String path){

        Path filePath = Path.of(path);

        if(Files.exists(filePath)){
            try {
                return new String(Files.readAllBytes(filePath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else return "File Not Found";

    }


    public static void writeFile(String input, String path){

        try {
            Files.write(Path.of(path),input.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void writeFile(String input, String path, boolean append){

        Path filePath = Path.of(path);

        if(append && Files.exists(filePath)){

                try {
                    Files.write(filePath,input.getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }else{writeFile(input, path);}

    }


    public static void writeJson(String path, Object object){

        Gson gson = new Gson();
        String json = gson.toJson(object);

        writeFile(json,path);

    }

    public static Human readJson(String path){

        String json = readFile(path);
        Gson gson = new Gson();
        return gson.fromJson(json, Human.class);

    }


}
