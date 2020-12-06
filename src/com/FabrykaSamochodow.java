package com;

interface Auto {
    int maxPredkosc();
}

class Mercedes implements Auto {
    int cena;
    int maxPredkosc = 100;
    String kolor;

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}

class BMW implements Auto {
    int cena;
    int maxPredkosc = 200;
    String kolor;

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}

class Audi implements Auto {
    int cena;
    int maxPredkosc = 300;
    String kolor;

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}


public class FabrykaSamochodow {
    public static Auto auto (int maxPredkosc) {
        Auto auto;

        switch (maxPredkosc){
            case 100:
                auto = new Mercedes();
                break;
            case 200:
                auto = new BMW();
                break;
            default:
                auto = new Audi();
        }
        return auto;
    }
}

class FabrykaTest{
    public static void main(String[] args) {
        Auto auto = FabrykaSamochodow.auto(100);
        System.out.println(auto.getClass());
    }
}





