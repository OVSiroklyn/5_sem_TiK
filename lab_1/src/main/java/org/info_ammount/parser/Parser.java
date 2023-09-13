package org.info_ammount.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
     * Метод для получения текста сайта по URL-адресу.
     * 
     * @param url URL-адрес
     * @return Результат в виде строки
*/
public class Parser {
    public static String parseUrl(String url) {
        String pythonOutput = "popa";
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("py", "server.py", url);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuilder output = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                pythonOutput = output.toString();
            } else {
                System.out.println("Error running py script");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return pythonOutput;
    }
}
