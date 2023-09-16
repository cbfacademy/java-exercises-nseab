 package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String... args) {
        String filePath = "C:\\Users\\naomi\\OneDrive\\Documents\\GitHub\\nseab\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File reading exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


