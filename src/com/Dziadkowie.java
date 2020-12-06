package com;

public class Dziadkowie {
    String mieszkanie;

    Dziadkowie(String mieszkanie) {
        this.mieszkanie = mieszkanie;
    }
}

class Rodzice extends Dziadkowie {
    String dom;

    Rodzice(String mieszkanie, String dom) {
        super(mieszkanie);
        this.dom = dom;
    }
}

class Dzieci extends Rodzice {
    int iloscZabawek;

    Dzieci(String mieszkanie, String dom, int iloscZabawek) {
        super(mieszkanie, dom);
        this.iloscZabawek = iloscZabawek;
    }
}

class RodzinaTest {

    public static void main(String[] args) {
        Dzieci dzieci = new Dzieci("ul. Jagielonska", "Krótka", 212323);
        dzieci.dom = "ul. Zelwerowicza";
        dzieci.mieszkanie = "ul. Warszawska";
        dzieci.iloscZabawek = 1223456765;

        System.out.println(dzieci.mieszkanie);
        System.out.println(dzieci.dom);
        System.out.println(dzieci.iloscZabawek);
    }
}
