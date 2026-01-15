package tech.codingclub;

import java.util.Scanner;

public class RunnableExample implements Runnable{
    private String threadName;
    public int counter;
    private int waitTimeWhileLoop;

    public RunnableExample(String threadName, int counter, int waitTimeWhileLoop){
        this.threadName=threadName;
        this.counter =counter;
        this.waitTimeWhileLoop=waitTimeWhileLoop;
    }
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
        RunnableExample runnable1=new RunnableExample("THREAD_A",0,5);
        RunnableExample runnable2=new RunnableExample("THREAD_B",0,10);
        RunnableExample runnable3=new RunnableExample("THREAD_C",0,20);


        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        Thread thread3=new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
    }

}
