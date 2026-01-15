package tech.codingclub;

import java.util.Date;

public class SinglentonandException {
    public static void main(String[] args) {
        System.out.println("This is Surabi Mondal");
        System.out.println("SinglentonabdException running at " + new Date().toString());

        SingletonExample.main(null);
        ExceptionExample.main(null);
    }
}
