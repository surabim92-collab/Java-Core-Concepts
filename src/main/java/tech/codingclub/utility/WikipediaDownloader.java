package tech.codingclub.utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;

import static javafx.beans.binding.Bindings.select;


public class WikipediaDownloader implements Runnable{

    private String keyword;
    public WikipediaDownloader(){

    }
    public WikipediaDownloader(String keyword) {

        this.keyword = keyword;
    }

    public  void run() {
// Get clean keyword !
        //step1-Get The URL for wikipedia
        // step2-Make  a GET request to wikipedia !
        //step3-parsing the usefulresults using jsoup
        //step4- showing results
        if (this.keyword == null || this.keyword.length() == 0) {
            return;
        }
        // step 1
        this.keyword = this.keyword.trim().replaceAll("[ ]+", "_");
        //step2
        String wikiUrl = getWikipediaUrlForQuery(this.keyword);
        String response = "";
        String imageUrl = null;
        try {
//            step 3
            String wikipediaResponseHTML = HttpURLConnectionExample.sendGet(wikiUrl);//CTL+P
            // System.out.println(wikipediaResponseHTML);

//            step 4
            Document document = Jsoup.parse(wikipediaResponseHTML, "https://en.wikipedia.org/");
            Elements childElements = document.body().select(".mw-parse-output >*");
            int state = 0;
            for (Element childElement : childElements) {
                if (state == 0) {
                    if (childElement.tagName().equals("table")) {
                        state = 1;
                    }
                } else if (state == 1) {
                    if (childElement.tagName().equals("p")) {
                        state = 2;
                        response = childElement.text();
                        break;
                    }
                }

            }
//            try {
//                imageUrl = document.body().select(".infobox img").get(0).attr("src");
//            } catch (Exception ex) {

//            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        WikiResult wikiResult = new WikiResult(this.keyword, response);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(wikiResult);
//        push result into database
        System.out.println(json);
    }

    private String getWikipediaUrlForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }

    public static void main(String[] args) {
        TaskManager taskManager =new TaskManager(20);
//        String arr[]={"India","United States"};
//        for(String keyword :arr) {
            WikipediaDownloader wikipediaDownloader= new WikipediaDownloader("Albert eiestien") ;
            taskManager.waitTillQueueIsFreeAndAddTask(wikipediaDownloader);
//        }
    }
}

