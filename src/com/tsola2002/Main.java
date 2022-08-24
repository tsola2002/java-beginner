package com.tsola2002;

public class Main {

    public static void main(String[] args) {

	      // write your code here
        String[] names = {"Anna", "Bella", "Charlie", "Dayo"};

        for( String name:names ) {
            // System.out.println(name);
            // break;

            if(name.equals("Dayo")){
                break;
            }
            System.out.println(name);
        }

    }
}
