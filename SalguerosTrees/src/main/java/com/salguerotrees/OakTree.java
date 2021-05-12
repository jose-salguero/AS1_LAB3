package com.salguerotrees;

public class OakTree implements Trees {

    public OakTree() {
    }


    public void make() { 
        System.out.println("Fabricando Arbol de roble.");
    }

    public void place(String serialNumber) {
        System.out.println(String.format("Colocando arbol de roble con numero serial de %s", serialNumber));
    }

}