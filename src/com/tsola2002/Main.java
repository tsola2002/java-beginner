package com.tsola2002;

public class Main {

    public static void main(String[] args) {
	      // write your code here
        boolean isAdult = false;
        boolean isStudent = true;
        String name = "mark";

        System.out.println(isAdult || isStudent);
        System.out.println((10 > 8 || 2 <= 2) && isAdult && name.contains("m"));
    }
}
