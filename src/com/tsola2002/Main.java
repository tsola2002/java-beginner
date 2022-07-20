package com.tsola2002;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        String name = "Alex";
        String surname = "Wang";
        String fullname = name + " " + surname;
        System.out.println(fullname);
        String fullname2 = name.concat(" Vera ").concat(surname);
        System.out.println(fullname2);
    }
}
