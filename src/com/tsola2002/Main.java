package com.tsola2002;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("My first Java Program");

        // String brand =  null;
        String brand =  "Omatsola";
        Optional<String> brandOptional =
                Optional.ofNullable(brand);
        //check if the optional is empty
        System.out.println(brandOptional.isEmpty());
//        if (brandOptional.isEmpty()) {
//            System.out.println("Brand is empty");
//        } else {
//            System.out.println(brandOptional.get());
//        }

        // doing a check using a lamda
//        brandOptional.ifPresentOrElse(b -> {
//            System.out.println(b.toUpperCase());
//        }, () -> {
//            System.out.println("Brand is empty");
//        });

        var result = brandOptional.orElse("Amigoscode");
        System.out.println(result);
        printUpperCase(Optional.of("foo"));
    }

    public static void printUpperCase(Optional<String> input){
        input.ifPresent(s -> s.toUpperCase());
    }
}
