package com.example;

import java.io.FileWriter;

public class FileWriterUtil {

    public static void writeFile(String content) {

        try {

            FileWriter writer = new FileWriter("output.txt");

            writer.write(content);

            writer.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
