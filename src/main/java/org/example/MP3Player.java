package org.example;

public class MP3Player implements Odtwarzacz {

    private boolean stan=false;

    @Override
    public void odtwarzaj() {
        stan=true;
        System.out.println("MPB gra");
    }
    @Override
    public void zatrzymaj() {
        stan=true;
        System.out.println("MPB nie gra");
    }

}
