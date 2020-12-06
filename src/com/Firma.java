package com;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    public static void main(String[] args) {

        Pracownik prezes = new Pracownik("Jan", "Kowalski", 50);
        Pracownik sekretarka = new Pracownik("Anna", "Nowicka", 30);
        Pielegniarka pielegniarka = new Pielegniarka("Karolina", "Kowal", 33, 160);

        List<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(prezes);
        pracownikList.add(sekretarka);
        pracownikList.add(pielegniarka);

        for (Pracownik pracownik : pracownikList) {
            pracownik.pobierzDane();
        }

//        Szef szef = new Szef();
//        szef.premia = 100;
//        szef.setImie("Darek");
//        szef.setNazwisko("Nowak");
//        szef.setWiek(55);
//
//        szef.pobierzDane();
//        System.out.println(szef.premie);



    }
}

//class Szef extends Pracownik{
//    int premia;
//}

class Pielegniarka extends Pracownik {
    int nadgodziny;

    Pielegniarka(String imie, String nazwisko, int wiek, int nadgodziny) {
        super(imie, nazwisko, wiek);
        this.nadgodziny = nadgodziny;

    }
}

class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    //konstruktor
    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String s) {
        this.imie = imie;
    }

    public void setNazwisko(String s) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int s) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane() {
        System.out.println(getImie() + " " + getNazwisko() + " " + getWiek());
    }


}