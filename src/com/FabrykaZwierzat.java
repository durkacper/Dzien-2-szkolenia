package com;

interface Zwierze {
    String dajGlos();
}

class Pies implements Zwierze {

    @Override
    public String dajGlos() {
        return "hau";
    }
}

class Kot implements Zwierze {

    @Override
    public String dajGlos() {
        return "miau";
    }
}

class Kon implements Zwierze {

    @Override
    public String dajGlos() {
        return "ihha";
    }
}


public class FabrykaZwierzat {

    public static Zwierze getZwierze(String glos) {
        Zwierze zwierze;

        switch (glos) {
            case "miau":
                zwierze = new Kot();
                break;
            case "ihha":
                zwierze = new Kon();
                break;
            default:
                zwierze = new Pies();
                break;
        }
        return zwierze;
    }

}

class FabrykaTest1{
    public static void main(String[] args) {
        Zwierze zwierze = FabrykaZwierzat.getZwierze("miau");
        System.out.println(zwierze.dajGlos());
        System.out.println(zwierze.getClass());
    }
}
