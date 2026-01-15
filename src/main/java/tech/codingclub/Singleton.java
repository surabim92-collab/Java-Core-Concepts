package tech.codingclub;

public class Singleton {
    // why Singleton?
    public int data;
    private static Singleton singleton;

    // only one reference
    private Singleton(int data) {
        //calling constructor
        this.data = data;
        System.out.println("Constructor was called when data was: " + data);
    }

    public static Singleton getSingletonInstance(int data) {
        if (singleton == null) {
            singleton = new Singleton(data);
        }
        return singleton;
    }
    // we want same memory to be accessed

}
