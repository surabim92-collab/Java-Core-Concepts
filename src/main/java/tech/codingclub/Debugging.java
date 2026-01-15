package tech.codingclub;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
public class Debugging {
    public static void main(String[] args)throws IOException {
        int N=10;
        int sum = 0;
        for (int i = 0; i <=N; i++) {
            sum = sum + i;
        }
        Singleton singleton=Singleton.getSingletonInstance(456);
        Singleton singleton1=Singleton.getSingletonInstance(106);
        System.out.println("Sum till N number :" + sum);
        System.out.println(new Date().toString());
        System.out.println(singleton.data + sum);
         int x=sum;
         int y=50;
         int z=x+y;
         System.out.println(z+"must be 100");
        FileInputStream fstream =new FileInputStream("C:\\Users\\surab\\IdeaProjects\\untitled\\src\\main\\java\\org\\example\\Debugging.java");
        BufferedReader br =new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        while((strLine =br.readLine())!=null){
            System.out.println(strLine);
        }
        fstream.close();
    }
}

