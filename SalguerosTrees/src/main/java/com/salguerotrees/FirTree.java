package com.salguerotrees;

public class FirTree implements Trees {

    public FirTree() {
    }

    public void make() {
        System.out.println("Fabricando arbol de abeto");
    }

    public void place(String serialNumber) {
        System.out.println(String.format("Colocando arbol de abeto con numero serial de %s", serialNumber));
    }

}