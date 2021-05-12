package com.salguerotrees;

public class PlasticTree implements Trees {

    public PlasticTree() {
    }

    public void make() {
        System.out.println("Fabricando Arbol de plastico.");
    }

    public void place(String serialNumber) {
        System.out.println(String.format("Colocando arbol de plastico con numero serial de %s", serialNumber));
    }

}