package tech.codingclub.utility;
import tech.codingclub.RunnableExample;

public class ThreadManager {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(100);
        for(int i=0;i<1000;i++){
        RunnableExample temp=new RunnableExample("THREAD.NO"+i,0,500+i);
        taskManager.waitTillQueueIsFreeAndAddTask(temp);
        //Queue is heavy now pause with in this loop
            System.out.println("$$$$$$$$$$$$" +i);
    }
        //problem no 1 :Task Manager for N no of thread parallaly
        // problem no 2:let say I want Main Thread to pause when there is enough queue size
        System.out.println("#####################");
}
}
