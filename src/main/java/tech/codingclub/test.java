package tech.codingclub;

import java.util.*;
import java.lang.Math;

public class test {
    public static void main(String[] args) {
        System.out.println("Surabi Mondal");
        System.out.println(new Date().toString());
        ArrayList<String> arrayList = new ArrayList<String>();//to add items in the string
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("java");
        arrayList.add("code");
        arrayList.add("RemoveME");
        String first = arrayList.get(0);// to get the element at 0 th index
        System.out.printf("First one :" + first);
        arrayList.set(2, "THE\n");//updated at index2
        int size = arrayList.size();
        arrayList.remove(size - 1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf(arrayList.get(i));
        }
        arrayList.clear();
        System.out.println("Size after clearing : " + arrayList.size());
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("This");
        linkedlist.add("is");
        linkedlist.add("how");
        linkedlist.add("you");
        linkedlist.add("code");
        linkedlist.add("linkedlist");
        String first_ = linkedlist.getFirst();
        String last = linkedlist.getLast();
        System.out.printf(first_ + ":" + last + " :" + linkedlist.size());
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext()) {
            String data = iterator.next();
            System.out.println(data);
        }
        Map<String, String> countrytocapital = new HashMap<String, String>();

        countrytocapital.put("India", "Delhi");
        countrytocapital.put("china", "Beijing");
        countrytocapital.put("canada", "ottawa");
        if (countrytocapital.containsKey("India")) {
            System.out.println("Capital of India is :" + countrytocapital.get("India"));
        }
        if (countrytocapital.containsKey("Russia")) {
            System.out.println("Capital of Russia is :" + countrytocapital.get("Russia"));
        } else {
            System.out.println("Capital of Russia is not there in the database");
        }
        // printing all keys
        System.out.println("keys below");
        for (String key : countrytocapital.keySet()) {
            System.out.println(key);
        }
        System.out.println("values below");
        for (String x : countrytocapital.values()) {
            System.out.println(x);
        }
        System.out.println("#######################");
        for (String key : countrytocapital.keySet()) {
            System.out.println(key + ":" + countrytocapital.get(key));
        }
        countrytocapital.remove("canada");
        System.out.println("###after removing canada###");
        for (String key : countrytocapital.keySet()) {
            System.out.println(key + ":" + countrytocapital.get(key));
        }
        System.out.println("the function of entryset");
        for (Map.Entry<String, String> x : countrytocapital.entrySet()) {
            System.out.println(x.getKey() + ":" + x.getValue());
        }
        countrytocapital.clear();
        System.out.println("#######################");
        for (String key : countrytocapital.keySet()) {
            System.out.println(key + ":" + countrytocapital.get(key));
        }
        for (Map.Entry<String, String> x : countrytocapital.entrySet()) {
            System.out.println(x.getKey() + ":" + x.getValue());
        }


    }
}



