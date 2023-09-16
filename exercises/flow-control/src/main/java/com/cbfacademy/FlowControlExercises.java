package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list

        
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
    
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case

        //  - it returns the constructed list
    
        // Looping from 1st index -> last in list

        ArrayList<String> stringList = new ArrayList<String>();
//Method1
        for (int i = 0; i <= numbers.size() - 1; i++) {
        
    
            // It's important to check FizzBuzz first else you only get buzz or fizz added to the ArrayList. The order matters!
            if (((numbers.get(i) % 3) == 0) && ((numbers.get(i) % 5) == 0)) {
                stringList.add("FizzBuzz");
            } else if ((numbers.get(i) % 5) == 0) {
                stringList.add("Buzz");
            } else if (numbers.get(i) % 3 == 0) {
                stringList.add("Fizz");
            } else {
                stringList.add(numbers.get(i).toString());
            }
        }
        
//Method 2
    //     numbers.forEach(number ->{ 
    //         if ((number%3==0) && (number%5==0))  {
    //             stringList.add("FizzBuzz");
    //         }   else if (number%3==0) {
    //             stringList.add("Fizz");
    //         }   else if (number%5==0) {
    //             stringList.add("Buzz");
    //         }   else {
    //             stringList.add(number.toString());
    //         }

    //    });
    
        return stringList;

    }
    
  
    
     


     
    public String whichMonth(Integer number) {
        String months[] = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September",
        "October", "November", "December"};
        if (number >=1 && number <=12){
            return months[number - 1];
        } else {
            return "Invalid month number";
        }

        //     throw new RuntimeException("Not implemented");
        }

        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"

    

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100

        // create a new ArrayList object
        ArrayList<Integer> oddsAndEvens = new ArrayList<Integer>();
        
        // use a for loop to add numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
          // add the number to the list
          oddsAndEvens.add(i);
        }
        //  - determines the sum of all the even numbers in the list
        // if there is an integer i <number, such that 2i = number -- add number to array list of even numbers  
        return null;

        //  - determines the sum of all the odd numbers in the list
        // if there is an integer i <number, such that 2i + 1 = number -- add number to array list of odd numbers 

        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // return sum of odd numbers and sum of even numbers

    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        return numbers;
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
  
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
