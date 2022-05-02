package testClasses;

public class Human {

    private String name;
    private int age;

    private Address address;


    public Human(){
        name = null;
        age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human (String name, int age, String city, String street){
        this.name = name;
        this.age = age;
        this.address = new Address(city, street);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
