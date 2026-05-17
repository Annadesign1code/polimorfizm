package org.example;

public class KatarynkaAdapter implements Odtwarzacz{

    private Katarynka katarynka;

    public KatarynkaAdapter (Katarynka katarynka){
        this.katarynka=katarynka;

    }
    @Override
    public void odtwarzaj(){
        katarynka.krecKorbka();


    };
    @Override
    public void zatrzymaj(){
        katarynka.zatrzymajKrecenie();
    }
}
