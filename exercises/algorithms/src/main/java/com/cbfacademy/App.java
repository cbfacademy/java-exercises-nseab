package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BinarySearch listOfNumbers = new BinarySearch();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12));
        System.out.println(listOfNumbers.search(arr, 8));
    }
}
