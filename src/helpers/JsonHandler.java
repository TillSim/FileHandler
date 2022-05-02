package helpers;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonHandler <Class>{

    Class obj;

    public JsonHandler(Class obj){
        this.obj = obj;
    }

    public Class readJason(String path){

        String json = FileHandler.readFile(path);
        Gson gson = new Gson();
        return gson.fromJson(json, (Type) obj.getClass());

    }


    public void writeJson(String path, Class obj){

        Gson gson = new Gson();
        String json = gson.toJson(obj);

        FileHandler.writeFile(json,path);

    }


}
