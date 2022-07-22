package com.tsola2002;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        int age = 16;
        if( age >= 18 ){
            System.out.println("Hooray, I'm an adult");
        } else if( age >= 16 && age < 18) {
            System.out.println("I'm almost an adult");
        } else {
            System.out.println("I'm not an adult");
        }
    }
}
