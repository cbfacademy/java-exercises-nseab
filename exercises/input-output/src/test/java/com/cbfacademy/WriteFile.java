package com.cbfacademy;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {
    public static void main(String... args) {
        String str = "Hello";
        String filePath1 = "C:\\Users\\naomi\\OneDrive\\Documents\\GitHub\\nseab\\exercises\\input-output\\src\\main\\resources\\output.txt";
        try (FileOutputStream outputStream = new FileOutputStream(filePath1)) {
            byte[] strToBytes = str.getBytes();
            outputStream.write(strToBytes);

            outputStream.close();        
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File reading exception: " + e.getMessage());
            e.printStackTrace();       
    }
}
}