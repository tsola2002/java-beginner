package com.tsola2002;

public class Main {

    public static void main(String[] args) {

	      // write your code here
        // System.out.println("My first Java Program");

        char[] letters = {'A','B','C','E','E','F'};
        int count = countOccurences(letters, 'E');
        System.out.println(count);

    }

    public static int countOccurences(char[] letters, char searchLetter){
        int count = 0;
        for(char letter: letters){
            if( letter == searchLetter) {
                count ++;
            }
        }
        return count;
    }
}
