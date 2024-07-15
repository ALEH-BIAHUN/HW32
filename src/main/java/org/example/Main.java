package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://tvn24.pl/";
            Document document = Jsoup.connect(url).get();
            Elements elements = document.select("div .teaser-wrapper");

            elements.forEach(element -> {
                        String title = element.text();
                        String link = element.select("a").attr("href");
                System.out.println("Title: " + title);
                System.out.println("Link: " + link);
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}