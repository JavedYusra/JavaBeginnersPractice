// encapsulation
class sth{
    private String name;
    private int age;
    private String address;

    public void sth(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        sth person = new sth();
        person.setName("John");
        person.setAge(30);
        person.setAddress("123 Main St");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
    
}
