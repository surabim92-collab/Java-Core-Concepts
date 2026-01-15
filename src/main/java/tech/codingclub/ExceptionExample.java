package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x = 100;
        Scanner scanner = new Scanner(System.in);

        try {
            int y = scanner.nextInt();
            int ans = x / y;
            System.out.println("ans is : " + ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int arr[] = {23, 2, 3, 2333};
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExeption !");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException !");
        } catch (Exception e) {
            System.out.println("caught !" + e.getClass());
        } finally {
            System.out.println("inside finally !");
        }

        int i = 100;
//        i++;
        if (i > 100) {
            throw new RuntimeException("i must not exceeds 100");
        }
        System.out.println("Hello World");
    }
}
