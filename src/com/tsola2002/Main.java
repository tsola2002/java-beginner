package com.tsola2002;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	      // write your code here
          Scanner scanner = new Scanner(System.in);

          System.out.println("What is your name?");

          // take in the answer as input
          String userName = scanner.nextLine();

          // print the result out
          System.out.println("Hello " + userName);

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        int year = LocalDate.now().minusYears(age).getYear();

        System.out.println("You were born in " + year );

        if(age < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("you are an adult");
        }


    }
}
