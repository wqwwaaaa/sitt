package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://sites.google.com/view/itmagic").get();
        String title = doc.title();
        System.out.println(title);

        Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println(link.attr("href"));
        }
    }
}
