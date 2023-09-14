package org.info_ammount.parser;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {
    /**
     * Метод для получения текста сайта по URL-адресу.
     *
     * @param url URL-адрес
     * @return Результат в виде строки
     */
    public static String getTextFromUrl(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc.text());
            return doc.text();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
