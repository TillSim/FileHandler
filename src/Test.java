import helpers.FileHandler;
import testClasses.Human;
import testClasses.Robot;

/**
 * <b>Test</b> is a class for testing all FileHandler methods.
 */
public abstract class Test {
    public static void main(String[] args) throws Exception {

        String outputFilePath = "output.txt";
        String outputJsonPath = "output.json";
        Robot testRobot1 = new Robot("Rob",1024);
        Human testHuman1 = new Human("Simon", 30, "Night City", "Main road");


        //TEST: write String to file and read file
        FileHandler.write(outputFilePath, "This text is written into " + outputFilePath + " ");
        System.out.println(FileHandler.read(outputFilePath));


        //TEST: override file
        FileHandler.write(outputFilePath,"This text overrides the existing " + outputFilePath + " ");
        System.out.println(FileHandler.read(outputFilePath));


        //TEST: append file
        FileHandler.write(outputFilePath, " This text is appended to the existing " + outputFilePath, true);
        System.out.println(FileHandler.read(outputFilePath));


        //TEST: write (Robot)Object to Json
        FileHandler.writeJson(outputJsonPath, testRobot1);
        System.out.println(outputJsonPath + " <-" + FileHandler.read(outputJsonPath));


        //TEST: create new (Robot)Object from Json
        Robot testRobot2 = FileHandler.readJson(outputJsonPath, Robot.class);
        FileHandler.writeJson(outputJsonPath, testRobot2);
        System.out.println(outputJsonPath + " ->" + FileHandler.read(outputJsonPath));


        //TEST: write (Human)Object to Json
        FileHandler.writeJson(outputJsonPath, testHuman1);
        System.out.println(outputJsonPath + " <-" + FileHandler.read(outputJsonPath));


        //TEST: create new (Human)Object from Json
        Human testHuman2 = FileHandler.readJson(outputJsonPath, Human.class);
        FileHandler.writeJson(outputJsonPath, testHuman2);
        System.out.println(outputJsonPath + " ->" + FileHandler.read(outputJsonPath));


        //TEST: delete file
        FileHandler.delete(outputFilePath);
        FileHandler.delete(outputJsonPath);

    }
}
