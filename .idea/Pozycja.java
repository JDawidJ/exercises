package zamowienie;

import java.util.List;

 public  class  Pozycja {
    private String nazwaPozycji;
    private int ileSztuk;
    private double cena;
public Pozycja(){}
    public Pozycja(String nazwaPozycji, int ileSztuk, double cena) {
        this.nazwaPozycji = nazwaPozycji;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public String getNazwaPozycji() {
        return nazwaPozycji;
    }

    public void setNazwaPozycji(String nazwaPozycji) {
        this.nazwaPozycji = nazwaPozycji;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obliczWartoscP(double cena, int ileSztuk){
        return (double)cena*ileSztuk;
    }

    @Override
    public String toString() {
        return  nazwaPozycji+"  "+cena+"zł  "+ ileSztuk+" szt.  RAZEM: "+obliczWartoscP(this.getCena(),this.getIleSztuk())+"zł";
    }

}
