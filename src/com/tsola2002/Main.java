package com.tsola2002;

import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        // REFERENCE DATA TYPES
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}
