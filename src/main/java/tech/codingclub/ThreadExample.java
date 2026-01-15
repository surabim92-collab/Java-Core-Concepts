package tech.codingclub;

import java.util.Scanner;

public class ThreadExample extends Thread{
    private String threadName;
    public int counter;
    private int waitTimeWhileLoop;

    public ThreadExample( String threadName,int counter,int waitTimeWhileLoop){
        this.threadName=threadName;
        this.counter =counter;
        this.waitTimeWhileLoop=waitTimeWhileLoop;
    }
    //we are overriding how run will gonna work!
    public void run(){
        //we will define what process we want to parallely
        while(counter <100){
        counter ++;
        //sleep
            try{
                Thread.sleep(waitTimeWhileLoop);
            }catch(InterruptedException e){
                e.printStackTrace();
            }


        System.out.println(threadName + ":" + counter);
    }}
    public static void main(String[] args) {
        System.out.println("This side is Surabi Mondal");
        ThreadExample thread1=new ThreadExample("THREAD_A",0,5);
        ThreadExample thread2=new ThreadExample("THREAD_B",0,10);
        ThreadExample thread3=new ThreadExample("THREAD_C",0,20);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.counter);
        System.out.println(thread2.counter);
        System.out.println(thread3.counter);

        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
    }

}
