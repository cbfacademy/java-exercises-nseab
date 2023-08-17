package com.cbfacademy;

//import javax.swing.plaf.synth.SynthDesktopIconUI;
class InvalidFileNameException extends Exception {
    private String fileName;


    public InvalidFileNameException(String message) {
        super(message);
    }


            
public class FileExtension {
    //throw exception if filename =null or filename=empty ""
    public int check(String fileName) throws InvalidFileNameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileNameException("File name cannot be null or empty");
            }        
        
            }

    // public int check(String fileName) {


    //     }
                
   
    
// Find index of "."
// Get all characters from "." onwards
// check whether substring is equal to ".java"


        int indexOfDot = fileName.lastIndexOf(".");
        String extension = fileName.substring(indexOfDot);

        if (extension.equals(".java")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


        }
        
    
public static void main(String[] args) {

FileExtension javaFile = new FileExtension();
System.out.println(javaFile.check(""));

}

}

