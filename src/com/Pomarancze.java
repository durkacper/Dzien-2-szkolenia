package com;

import java.util.ArrayList;
import java.util.List;

public class Pomarancze implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Pomarancze(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena * 2;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Banany implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Banany(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena * 3;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Jablka implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Jablka(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

interface Owoce {
    int pobierzCene();

    int pobierzWage();

}

class OwoceTest {
    public static void main(String[] args) {
        Owoce pomarancze = new Pomarancze(12, 23, "Pomaranczowy");
        Owoce banany = new Banany(2, 123, "Zolte");
        Owoce jablka = new Jablka(23, 12, "Czerwone");

        List<Owoce> owoceList = new ArrayList<>();
        owoceList.add(pomarancze);
        owoceList.add(banany);
        owoceList.add(jablka);

        for(Owoce owoce:owoceList){
            System.out.println(owoce.pobierzCene());
            System.out.println(owoce.pobierzWage());
        }


    }

}
