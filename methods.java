class Practice {
    // Method without parameters
    public void run() {
        System.out.println("Dog is running");
    }

    int x = 56; // instance variable

    // Method with parameter
    public int value(int x) {
        System.out.println(x);
        return x;
    }
}

public class methods {
    public static void main(String[] args) {
        Practice dog = new Practice();
        dog.run(); // calls run()


        Practice obj = new Practice();
        obj.value(obj.x); // pass the field x from obj
    }
}
