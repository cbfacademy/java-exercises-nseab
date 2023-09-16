package com.cbfacademy;

public class FileExtension {
    //throw exception if filename =null or filename=empty ""
    public static int check(String fileName) throws InvalidFileNameException 
    {
        if (fileName == null || fileName.isEmpty()) 
        {
            throw new InvalidFileNameException("File name cannot be null or empty");
            }        
 
            // Find index of "."
            // Get all characters from "." onwards
            // check whether substring is equal to ".java"

        int indexOfDot = fileName.lastIndexOf(".");
        String extension = fileName.substring(indexOfDot);

        if (extension.equals(".java")) 
        {
            return 1;
        } 
        else 
        {
            return 0;
        }

    }
        

}

