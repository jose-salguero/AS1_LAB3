package com.salguerotrees;

import java.util.*;

public class TreeFactory {

    public TreeFactory() {
    }

    public Trees getTree(TreeTypes treeType) {
        
        switch(treeType) {
            case OAK: return new OakTree();
            case FIR: return new FirTree();
            case BIRCH: return new BirchTree();
            case PLASTIC: return new PlasticTree();
            case PINE: return new PineTree();
            default: return null;
        }
        
    }

}