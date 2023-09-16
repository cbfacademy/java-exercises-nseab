package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public int search(ArrayList<Integer> arr, int target) {
        arr = Collections.sort(arr);
    int low = 0;
    int high = arr.size() - 1;
    
    while (low <= high) {
        int mid = (low + high)/2;
    if (target == arr.get(mid)) {
      return mid;  
    } 

    else if (target > arr.get(mid)) {
        low = mid + 1;
    } 

    else {
        high = mid - 1;
    }
    }
    return -1;
    
    }

    // do until the pointers low and high meet each other.
    // mid = (low + high)/2
    // if (x == arr[mid])
    //     return mid
    // else if (x > arr[mid]) // x is on the right side
    //     low = mid + 1
    // else                       // x is on the left side
    //     high = mid - 1
}

