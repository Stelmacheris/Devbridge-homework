package com.example.devbridgehomework;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloApplication {
    public static void main(String[] args) {

        File folder = new File(".\\");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader(
                            file.getName()));
                    String line = reader.readLine();
                    while (line != null) {
                        Pattern pattern = Pattern.compile("\\d{2}", Pattern.CASE_INSENSITIVE);
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.find() && Integer.parseInt(matcher.group()) >= 10) {
                            System.out.println(line);
                        }
                        line = reader.readLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}