package org.example;

public class Katarynka {

    private boolean korbka=false;

    public void krecKorbka(){
        System.out.println("Katarynka gra");
        korbka=true;
    }

    public void zatrzymajKrecenie(){
        System.out.println("Katarynka nie gra");
        korbka=false;
    }
}


