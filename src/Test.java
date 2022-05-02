import fileReader.FileHandler;
import testClasses.Human;

public abstract class Test {
    public static void main(String[] args) {

        String outputFilePath = "output.txt";
        String outputJsonPath = "output.json";
        Human testHuman1 = new Human("Simon", 30);

        FileHandler.writeFile("Hello", outputFilePath);
        System.out.println(FileHandler.readFile(outputFilePath));
        FileHandler.writeFile(" World", outputFilePath, true);
        System.out.println(FileHandler.readFile(outputFilePath));

        FileHandler.writeJson(outputJsonPath, testHuman1);
        System.out.println(FileHandler.readFile(outputJsonPath));
        Human testHuman2 = FileHandler.readJson(outputJsonPath);
        FileHandler.writeJson(outputJsonPath, testHuman2);
        System.out.println(FileHandler.readFile(outputJsonPath));


    }
}
