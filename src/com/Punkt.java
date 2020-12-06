package com;

public class Punkt {
    int x;
    int y;

    Punkt(int a, int b) {
        x = a;
        y = b;
    }
}

class TestPunkt {

    public static void main(String[] args) {
        Punkt punkt = new Punkt(4,2);
    }
}