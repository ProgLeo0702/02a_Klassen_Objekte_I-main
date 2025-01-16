package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /*
        *   Instanziierung --> Erzeugen eines Objektes durch Aufruf eines Konstruktors
        *   Objekt <-----> Instanz
        *   cat --> Referenzvariable
        *   Cat --> Referenztyp (Klasse)
        */


    // IMPLIZITE Typumwandlung  Cat --> String

        Cat cat = new Cat();
        output("Blick von außen: " + cat);
        cat.getInstanceVariable();


        output("---------------------");

        Cat cat2 = new Cat();
        output("Blick von außen: " + cat2);
        cat2.getInstanceVariable();
      

    }
  
        

    public static void output(String outputStr){
    System.out.println(outputStr); 
    }


}

