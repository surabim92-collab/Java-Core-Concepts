package tech.codingclub.utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TopKeywordAnalyser implements Runnable{
    private final String filePath;
    public TopKeywordAnalyser(String filePath){
        this.filePath=filePath;
    }
    public void run(){
        ArrayList<String> keywordsFileData=FileUtility.readAndPrintFile(filePath);
        HashMap<String,Integer> keywordCounter = new HashMap<String,Integer>();
        for(String row : keywordsFileData ){
            String[] keywords=row.split(" ");
            // within each row process each keyword
            for(String keyword : keywords){
               String str= keyword.toLowerCase();
               // if not there in hashmap
               if(! keywordCounter.containsKey(str)){
                   // first time any keyword found
                   keywordCounter.put(str,1);
               }else{
                   Integer value =keywordCounter.get(str);
                   keywordCounter.put(str,value+1);
               }
            }
        }
        // abc -3,def-7
        ArrayList<KeywordCount>keywordCountArrayList=new ArrayList<KeywordCount>();
        for (String keyword : keywordCounter.keySet()){
            KeywordCount keywordCount=new KeywordCount(keyword , keywordCounter.get(keyword));
            keywordCountArrayList.add(keywordCount);
        }
        Collections.sort(keywordCountArrayList, new Comparator<KeywordCount>() {
            @Override
            public int compare(KeywordCount o1, KeywordCount o2) {
                if(o2.count==o1.count){
                    return o1.keyword.compareTo(o2.keyword);
                }
                return o2.count-o1.count;
            }
        });
  //      for(KeywordCount keywordCount : keywordCountArrayList){
   //         System.out.println(keywordCount.keyword + ":"+ keywordCount.count);
  //      }
        String json =new Gson().toJson(keywordCountArrayList);
        System.out.println(json);

        String convertJson ="{\"keyword\":\"Hello Gson\",\"count\":100}";
        KeywordCount keywordCount =new Gson().fromJson(convertJson,KeywordCount.class);
        System.out.println("Converted to object " + keywordCount.keyword + ":" + keywordCount.count);

        String convertJsonArray ="[{'keyword':'Hello Gson','count':1},{'keyword':'Last One','count':100}]";
        ArrayList<KeywordCount> convertedArraylist =new Gson().fromJson(convertJsonArray,new TypeToken<ArrayList<KeywordCount>>(){}.getType());
        System.out.println("Arraylist from Json");
        for(KeywordCount keywordCountTemp : convertedArraylist){
            System.out.println(keywordCountTemp.keyword + ":"+ keywordCountTemp.count);
        }

    }
    public static void main(String[] args){
        TaskManager taskManager =new TaskManager(1);
        taskManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyser("C:\\Users\\surab\\IdeaProjects\\untitled\\data\\practice\\file\\NationalAnthem"));
    }


}