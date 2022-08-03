package com.tsola2002;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // LISTS
        List numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(9);
        numbers.add(100);
        numbers.add(1000);

	      // write your code here
        //System.out.println(numbers);

        //looping throught the list
        //        for(Object number: numbers) {
        //            System.out.println(number);
        //        }


        //loop through the list using foreach
        numbers.forEach(System.out::println);

    }
}
