package tech.codingclub;

import java.util.Iterator;
import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack<Integer> stackint = new Stack<Integer>();
        // push or add element
        stackint.push(2);
        stackint.push(5);
        stackint.push(10);
        stackint.push(101);
        // pop or remove element
        // what is at the top
        System.out.println("Top element :" + stackint.peek());
        int topelementpoped = stackint.pop();//101
        // check weather stack is empty or not
        // what is at the top
        System.out.println("Top element after popped out first element :" + stackint.peek());
        int index = stackint.search(2);
        int find200 = stackint.search(200);
        System.out.println("index of 2 =" + index);
        System.out.println("index of 200 = " + find200);
        Iterator integeriterator = stackint.iterator();
        while (integeriterator.hasNext()) {
            System.out.println("iterator showing element : " + integeriterator.next());
        }

        while (!stackint.empty()) {
            int topelement = stackint.pop();
            System.out.println("popped :" + topelement);
        }

    }
}
