package com.cbfacademy;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String... args) {
        String filePath = "src/com/codingblackfemales/academy/Program.java";
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File reading exception: " + e.getMessage());
        }
    }
}
