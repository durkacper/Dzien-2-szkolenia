package com;

public class Dzialanie {

    public static void mnozenie(int x, int y) {
        System.out.println(x * y);
    }

    public static void mnozenie(int x, double y, int z) {
        System.out.println(x * y * z);
    }

    public static void mnozenie(int x, int y, int z, int q) {
        System.out.println(x * y * z * q);
    }
}

class DzialanieTest {
    public static void main(String[] args) {
        Dzialanie.mnozenie(2, 6);
        Dzialanie.mnozenie(2, 6, 7);
        Dzialanie.mnozenie(2, 6, 2, 2);
        Dzialanie.mnozenie(8, 12);
    }
}