package tech.codingclub;

import java.util.Date;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        Random random = new Random();
        int randomIntValue = random.nextInt(100);
        System.out.println("randomIntValue: 0 to 99 =" + randomIntValue);
        int randomIntValueInRange = 50 + random.nextInt(50);
        System.out.println("randomIntValue: 50 to 99 =" + randomIntValueInRange);
        String string = "HelloWorld";
        System.out.println("printing string :" + string);
        string = string + "!";
        System.out.println("printing modified string : " + string);
        System.out.println("Current length :" + string.length());
        System.out.println("string(5,end) : " + string.substring(5));
        System.out.println("string(5,7): " + string.substring(5, 7));
        System.out.println("UC :" + string.toUpperCase());
        System.out.println("LC :" + string.toLowerCase());
        int h = string.indexOf('H');
        System.out.println("index of h = " + h);
        char g = string.charAt(6);
        System.out.println("char at 6 = " + g);
        String s1 = "abc";// s2>s1 -> neg , s2<s1 -> pos , s1=s2 -> 0
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));
        Date date = new Date();
        long previousEpochTime = date.getTime();
        for (int i = 0; i < 1000000; i++) {
        }
        long Timenow = new Date().getTime();
        long diff = (Timenow - previousEpochTime);
        System.out.println(diff + " milliseconds to run 10 to the power 6 on my machine.");
        System.out.println(" current time " + new Date().toString());
        Date dateFromEpoch = new Date(1584635277184L);
        System.out.println(dateFromEpoch.toString());
    }
}