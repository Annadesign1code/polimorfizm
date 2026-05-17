package org.example;

public class CDPlayer implements Odtwarzacz{

    private boolean stan=false;

    @Override
    public void odtwarzaj() {
        stan=true;
        System.out.println("CD Player gra");
    }
    @Override
    public void zatrzymaj() {
        stan=true;
        System.out.println("CD Player nie gra");
    }
}
