package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29);

      ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
      ausgabe("Name: " + cat1.getName());
      ausgabe("Fellfarbe: " + cat1.getFurColor());
      ausgabe("Alter: " + cat1.getAge());
    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35);
      cat2.setName("Alonzo, der Coole!");
      
      ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
      ausgabe("Name: " + cat2.getName());
      ausgabe("Fellfarbe: " + cat2.getFurColor());
      ausgabe("Alter: " + cat2.getAge());
     
      ausgabe("--------------------");

      // ausgabe(2); //Typ muss konvertiert werden!
      ausgabe("Wert: " + 2);
      ausgabe(String.valueOf(2));
      ausgabe(Integer.toString(2));
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }

}
