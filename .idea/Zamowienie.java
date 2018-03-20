package zamowienie;

import java.util.Arrays;
import java.util.List;

public class Zamowienie {
    Pozycja[] pozycja=new Pozycja[0];
    int ileDodanych;
    int maksymalnyRozmiar = 10;

    public Zamowienie() {
    }

    public Zamowienie(int maksymalnyRozmiar) {

        maksymalnyRozmiar = this.maksymalnyRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja) {
        this.pozycja = Arrays.copyOf(this.pozycja, this.pozycja.length + 1);
        this.pozycja[this.pozycja.length-1] = pozycja;
    }

    public double obliczWartosc(Pozycja[] pozycja) {
        double wartoscZam = 0;
        double suma = 0;
        for (int i = 0; i < pozycja.length; i++) {
            wartoscZam = pozycja[i].obliczWartoscP(pozycja[i].getCena(), pozycja[i].getIleSztuk());
            suma = suma + wartoscZam;

        }
        return suma;
    }

    @Override
    public String toString() {
        Pozycja poz=null;
        String temp="";
        for (int i = 0; i <pozycja.length ; i++) {
            temp=temp+ pozycja[i].toString()+"\n";
        }
        return temp+"\n"+"LACZNA WARTOSC: "+obliczWartosc(this.pozycja);
    }
}
