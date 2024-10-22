package org.fangarc.service;

import org.fangarc.model.Story;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Scraper {
    public Story fetchStoryDetail(String url) throws IOException {
        Document page = Jsoup.connect(url).get();

        String titleBody = page.title();
        String title = page.selectXpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/h2").text();

        // Comparison
        System.out.println("This is titleBody: " + titleBody);

        return new Story(url, title);
    }
}
