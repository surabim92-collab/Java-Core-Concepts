package tech.codingclub;

import java.util.*;

public class Setexample {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("admin@google.com");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("hr@tiktok.com");
        emails.add("admin@tiktok.com");
        emails.add("admin@tiktok.com");

        ArrayList<String> blackListedEmails = new ArrayList<String>();
        blackListedEmails.add("admin@tiktok.com");
        blackListedEmails.add("hr@tiktok.com");
        Set<String> uniqueEmails = new HashSet<String>();
        uniqueEmails.add("hr@google.com");
        uniqueEmails.addAll(emails);
        Iterator<String> iterator = uniqueEmails.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator showing :" + iterator.next());
        }
        System.out.println("size of set :" + uniqueEmails.size());
        uniqueEmails.remove("admin@linkedin.com");
        uniqueEmails.removeAll(blackListedEmails);
        System.out.println("size of set after removing  :" + uniqueEmails.size());
        System.out.println("removed linkedin mail and blacklistedemails");
        for (String x : uniqueEmails) {
            System.out.println("for loop showing or sending email to  :" + x);
        }
        boolean codingclubmailexist = uniqueEmails.contains("contact@codingclub.tech");
        System.out.println(codingclubmailexist);
        System.out.println(uniqueEmails.isEmpty());
        System.out.println("##before sorting##");
        for (String mail : emails) {
            System.out.println(mail);
        }
        Collections.sort(emails);
        System.out.println("after sorting");
        for (String mail : emails) {
            System.out.println(mail);
        }
        int arr[] = {43, 3, 24324, 44};
        Arrays.sort(arr);
        for (int element : arr) {
            System.out.println(element);
        }

    }
}
