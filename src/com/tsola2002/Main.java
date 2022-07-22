package com.tsola2002;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        String gender = "FEMALE";

        switch (gender) {
            case "FEMALE":
                System.out.println("I AM A FEMALE");
                break;
            case "MALE":
                System.out.println("I AM A MALE");
                break;
            case "RATHER_NOT_SAY":
                System.out.println("RATHER NOT SAY");
                break;
            default:
                System.out.println("YOU HAVE NO GENDER");
        }


    }
}
