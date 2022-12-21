package com.tsola2002;

public class Main {

    public static void main(String[] args) {

	      // write your code here
        System.out.println("My first Java Program");

        Lens lensOne = new Lens("Sony",
                            "85mm",
                                true);

        Lens lensTwo = new Lens("Canon",
            "40mm",
            true);

        Lens lensThree = new Lens("Panasonic",
            "100mm",
            false);


    }

    static class Lens{
        String brand;
        String focalLength;
        Boolean isPrime;

        Lens(String brand, String focalLength, Boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
