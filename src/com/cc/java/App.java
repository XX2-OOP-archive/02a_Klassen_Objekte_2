package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29);

      ausgabe("Name: " + cat1.getName());
      ausgabe("Fellfarbe: " + cat1.getFurColor());
      ausgabe("Alter: " + cat1.getAge());
    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35);
      
      ausgabe("Name: " + cat2.getName());
      ausgabe("Fellfarbe: " + cat2.getFurColor());
      ausgabe("Alter: " + cat2.getAge());
    
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }

}
