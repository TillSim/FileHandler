package testClasses;

public class Robot {

    private String id;
    private int ram;

    public Robot() {
        id = null;
        ram = 0;
    }

    public Robot(String id, int ram) {
        this.id = id;
        this.ram = ram;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
