package com;

public class Main {

    public static void main(String[] args) {

        Samochod fiat = new Samochod();
        fiat.jedzie(100);
        fiat.kolor = "Czerwony";
        fiat.mocKM = 120;

        Samochod kia = new Samochod();
        kia.jedzie(100);
        kia.stop();

        Rower rower = new Rower();
        rower.jedzie(23);
        rower.stop();
    }
}

class Samochod extends Pojazd {
    String kolor;
    int mocKM;

    @Override
    public void stop() {
        System.out.println("Zatrzymaj sie");
    }

    public int getMocKM() {
        return mocKM;
    }
}

class Rower extends Pojazd {


    @Override
    public void stop() {
        System.out.println("Nacisnij hamulec");
    }
}


abstract class Pojazd {

    void jedzie(int predkosc) {
        System.out.println("Rusz pojazdem z predkoscia " + predkosc);
    }

    abstract void stop();
}