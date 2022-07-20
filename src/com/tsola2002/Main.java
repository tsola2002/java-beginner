package com.tsola2002;

public class Main {

    public static void main(String[] args) {
	  // write your code here

        int a = 10;
        int b = a;

        System.out.println("a:" + a + "b: " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before Changing name");
        System.out.println(alex.name + " " + mariam.name );

        //alex.name = "omatsola";
        mariam.name = "mirabel";

        System.out.println("After Changing name");
        System.out.println(alex.name + " " + mariam.name );
    }

    // SAMPLE CLASS FOR REFERENCE
    static class Person {
        String name;

        // CONSTRUCTOR
        Person (String name) {
            this.name = name;
        }
    }
}
