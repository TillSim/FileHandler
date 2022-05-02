import helpers.FileHandler;
import helpers.JsonHandler;
import testClasses.Human;
import testClasses.Robot;

public abstract class Test {
    public static void main(String[] args) {



//***************************************************************************************************************************************************
        // FileHandler
        String outputFilePath = "output.txt";

        FileHandler.writeFile("This text is written into " + outputFilePath + " ", outputFilePath);
        System.out.println(FileHandler.readFile(outputFilePath));

        FileHandler.writeFile("This text overrides the existing " + outputFilePath + " ", outputFilePath);
        System.out.println(FileHandler.readFile(outputFilePath));

        FileHandler.writeFile(" This text is appended to the existing " + outputFilePath, outputFilePath, true);
        System.out.println(FileHandler.readFile(outputFilePath));
//***************************************************************************************************************************************************


//***************************************************************************************************************************************************
        // JsonHandler
        String outputJsonPath = "output.json";
        Robot testRobot1 = new Robot("Rob",1024);
        Human testHuman1 = new Human("Simon", 30, "Night City", "Mainroad");

        JsonHandler<Robot> robotJsonHandler = new JsonHandler<>(new Robot());
        JsonHandler<Human> humanJsonHandler = new JsonHandler<>(new Human());


        robotJsonHandler.writeJson(outputJsonPath, testRobot1);
        System.out.println(outputJsonPath + " <-" + FileHandler.readFile(outputJsonPath));

        Robot testRobot2 = robotJsonHandler.readJason(outputJsonPath);
        robotJsonHandler.writeJson(outputJsonPath, testRobot2);
        System.out.println(outputJsonPath + " ->" + FileHandler.readFile(outputJsonPath));


        humanJsonHandler.writeJson(outputJsonPath, testHuman1);
        System.out.println(outputJsonPath + " <-" + FileHandler.readFile(outputJsonPath));

        Human testHuman2 = humanJsonHandler.readJason(outputJsonPath);
        humanJsonHandler.writeJson(outputJsonPath, testHuman2);
        System.out.println(outputJsonPath + " ->" + FileHandler.readFile(outputJsonPath));
//***************************************************************************************************************************************************

    }
}
