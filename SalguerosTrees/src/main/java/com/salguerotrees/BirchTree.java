package com.salguerotrees;

public class BirchTree implements Trees {

    public BirchTree() {
    }

    public void make() {
        System.out.println("Fabricando arbol de Abedul");
    }

    public void place(String serialNumber) {
        System.out.println(String.format("Colocando arbol de abedul con numero serial de %s", serialNumber));
    }

}