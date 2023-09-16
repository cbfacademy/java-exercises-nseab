package com.cbfacademy;

import java.util.List;

public class App {
    public static void main(String[] args) {
    FlowControlExercises exercises = new FlowControlExercises();
    //How to define a list/collection of ordered elements in java
    List<Integer> numbers = List.of(1,2,3,5,9,15,21,30,35);
    System.out.println(exercises.fizzBuzz(numbers));

    System.out.println(exercises.whichMonth(13));
    }
}
