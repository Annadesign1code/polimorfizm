package org.example;


import java.util.Scanner;

public class Main {
    static void main() {

Odtwarzacz mp3Player=new MP3Player();
Odtwarzacz cdPlayer=new CDPlayer();
Katarynka katarynka=new Katarynka();
Odtwarzacz katarynkaAdapter=new KatarynkaAdapter(katarynka);
Odtwarzacz odtwarzacz=null;

int decyzja;
Scanner scanner =new Scanner(System.in);

do{
    System.out.println("Wybierz urządzenie do odtwarzania lub akcję");
    System.out.println("1. Wybieram MP3 Player");
    System.out.println("2. Wybieram CD Player");
    System.out.println("3. Wybieram Katarybka");
    System.out.println("4. Graj na wybranym sprzęcie");
    System.out.println("5. zatrzymaj muzykę");
    System.out.println("0.Wyjście");
    System.out.print("?>");
    decyzja=scanner.nextInt();

    switch (decyzja){
        case 1:
            odtwarzacz=mp3Player;
            break;
        case 2:
            odtwarzacz=cdPlayer;
        case 3:
            odtwarzacz=katarynkaAdapter;
            break;
        case 4:
            odtwarzacz.odtwarzaj();
            break;
        case 5:
            odtwarzacz.zatrzymaj();
            break;
        case 0:
            System.out.println("Do widzenia");
            break;

    }


}while(decyzja!=0);

    }
}
