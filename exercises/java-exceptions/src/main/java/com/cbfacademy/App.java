package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidFileNameException
    {
        List<String> fileList = new ArrayList<>();
        fileList.add("App.java");
        fileList.add("App.txt");
        fileList.add(null);
        fileList.add("App.md");
        
        Map <String , Integer> m = new HashMap <>();

        for (String f: fileList) 
        {
          try 
          {
            int val = FileExtension.check(f);
            m.put(f , val);
          }  
          catch (InvalidFileNameException e)
          {
            m.put(f , -1);
          }
            
        }

        System.out.println(m);
    }
}
