package tech.codingclub;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingletonInstance(90);
        Singleton obj2 = Singleton.getSingletonInstance(56);
        obj1.data = 90;
        obj2.data = 56;
        // not a singleton till now
        System.out.println(obj1.data + " & " + obj2.data);
    }
}
