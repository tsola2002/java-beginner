package com.tsola2002;

public class Main {

    public static void main(String[] args) {

	      // write your code here
          // System.out.println("My first Java Program");

        String[] names = {"Anna", "Ted", "Alex", "Tamara"};

//        for( String name : names ) {
//            System.out.println(name);
//            break;
//        }

        for( String name : names ) {
            if(name.equals("Anna")) {
                break;
            }
            System.out.println(name);

        }

    }
}
