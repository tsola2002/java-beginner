package com.tsola2002;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	      // ARRAYS
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] letters = {  "a", "b", "c", "d", "e" };
        System.out.println( "My first Java Program" );

        int[] num = new int[3];
        numbers[0] = 4;
        numbers[1] = 1;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(letters));
    }
}
