package org.info_ammount.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {
    /**
     * Метод для получения текста сайта по URL-адресу.
     *
     * @param urlString URL-адрес
     * @return Результат в виде строки
     */
    public static String readUrl(String urlString) throws Exception {
        URL url = new URL(urlString);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder content = new StringBuilder();

        String line = "";
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();

        System.out.println(content.toString());
        return content.toString();
    }

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
