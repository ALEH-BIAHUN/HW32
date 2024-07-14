package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://tvn24.pl/";
        try {
            Document document = Jsoup.connect(url).get();
            Elements elements = document.select("div .article-header");
            for (Element element : elements) {
                System.out.println(element.text());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
