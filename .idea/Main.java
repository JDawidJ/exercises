package zamowienie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        Random los=new Random();
        Zamowienie zam2 = new Zamowienie();
        int takNie = 0;
        do {
            System.out.println("Co zamawiasz: ");

            String nazwa = skan.next();
            System.out.println("ile sztuk: ");
            int iloscSztuk = skan.nextInt();

            int cena=los.nextInt(25);
/*
            System.out.println("w jakiej cenie(?): ");
            int cena = skan.nextInt();*/

            System.out.println("czy to koniec zamowienia:(tak=1,nie=2)");
            takNie = skan.nextInt();

            zam2.dodajPozycje(new Pozycja(nazwa, iloscSztuk, cena));
        }
        while (takNie == 2);

        System.out.println(zam2.toString());





/*Pozycja poz=new Pozycja("Cekier",1,5);
Pozycja poz2=new Pozycja("Bułka",5,0.45);
Pozycja poz3=new Pozycja("Cukierki",45,1.4);

Zamowienie zam1=new Zamowienie();
zam1.dodajPozycje(poz);
zam1.dodajPozycje(poz2);
zam1.dodajPozycje(poz3);


        System.out.println(zam2.toString());

        // System.out.println(poz.toString());
       // System.out.println(poz3.toString());
       // System.out.println(zam1.toString());

        *//*System.out.println(zam1.obliczWartosc(zam1.pozycja));*/
    }

    public static void zamawiam(String nazwa, int iloscSztuk, int cena) {
        for (int i = 0; i < 5; i++) {

        }

    }
}
