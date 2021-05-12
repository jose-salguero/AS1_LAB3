package com.salguerotrees;

public class PineTree implements Trees {

    public PineTree() {
    }

    public void make() {
        System.out.println("Fabricando Arbol de pino.");
    }

    public void place(String serialNumber) {
        System.out.println(String.format("Colocando arbol de pino con numero serial de %s", serialNumber));
    }

}