package tech.codingclub.utility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FreqAnalyser {
    public static boolean createFile(String fileNameWithPath){
        File file =new File(fileNameWithPath);
        boolean fileCreated= false;
        try {
            fileCreated=  file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileCreated;
    }
    public static ArrayList<String> readAndPrintFile(String fileName) {
        Scanner scanner = null;
        ArrayList<String>strings=new ArrayList<String>();
        try {
            File file = new File(fileName);
            scanner =new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                strings.add(word);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return strings;
    }
    public static boolean writeToFile(String fileNameWithPath,String content){
        BufferedWriter bw =null;
        try{
            File file=new File(fileNameWithPath);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw=new FileWriter(file.getAbsoluteFile());
            bw=new BufferedWriter(fw);
            bw.write(content);
        }catch(IOException e){
            return false;
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
    public static boolean appendToFile(String fileName, String content){
        try{
            FileWriter fileWriter=new FileWriter(fileName,true);
            fileWriter.append("\n");
            fileWriter.append(content);
            fileWriter.close();
        }catch(Exception e){
            return false;
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("This side is Surabi Mondal");
        System.out.println("Running FrequencyAnalyser at "+ new Date().toString());
        String nameOfNewFile="C:\\Users\\surab\\IdeaProjects\\untitled\\data\\practice\\file";
      boolean created= createFile(nameOfNewFile);
      System.out.println("File created :"+created);
        Map<String,Integer>freqCount=new HashMap();
     ArrayList<String> stringArrayList= readAndPrintFile(nameOfNewFile);
     for(String word:stringArrayList) {
         freqCount.put(word, freqCount.getOrDefault(word, 0) + 1);
     }
     Integer Max=0;
     String KEY="";
     for(int i=0;i<9;i++){
         for(String key:freqCount.keySet()) {
             int count = freqCount.get(key);
             if (count > Max) {
                 Max = count;
                 KEY = key;
             }
         }
         System.out.println(Max+ ":" + KEY);
         freqCount.remove(KEY,Max);
         Max=0;
         KEY="";
     }
    }
}






