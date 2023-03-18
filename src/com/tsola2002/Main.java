package com.tsola2002;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println("My first Java Program");
       //String brand = null;
        String brand = "Amigoscode";
       try {
           System.out.println(brand.toUpperCase());
       } catch (NullPointerException e){
           System.out.println(e);
       }
    }

     static class Cat {
        private String name;

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public Cat(String name) {
            this.name = name;
        }
    }

}
