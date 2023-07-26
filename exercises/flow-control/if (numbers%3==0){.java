    if (numbers%3==0){
        System.out.println("Fizz");
    }
    //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
    else if (numbers%5==0){
        System.out.println("Buzz");
    }
    //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list 
    else if (numbers%3==0 & numbers%5==0 ) {
        System.out.println("FizzBuzz");
    }
    //  - it adds the element to the list in any other case 
    else {
        System.out.println(numbers);
    }