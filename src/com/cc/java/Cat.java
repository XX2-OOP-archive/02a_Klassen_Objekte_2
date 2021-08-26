package com.cc.java;

public class Cat {
    
    // Attribut | Field | Property
    private String name;
    private String furColor; 
    private int age;
    private boolean isFemale;

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getStringAttributes(String flag){
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
               return "#!?";
        }
    }

    public String getAge() {
        if (isFemale) {
            return "No Permission!";
        } else {
            // return Integer.toString(age);
            return String.valueOf(age);
        }
    }

  
   


}
