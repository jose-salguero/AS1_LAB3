package com.salguerotrees;

public class SalgueroTreesApp {

    public SalgueroTreesApp() {
    }

    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        
        Trees myBirchTree = treeFactory.getTree(TreeTypes.BIRCH);
        Trees myPineTree = treeFactory.getTree(TreeTypes.PINE);
        Trees myOakTree = treeFactory.getTree(TreeTypes.OAK);
        Trees myFirTree = treeFactory.getTree(TreeTypes.FIR);
        Trees myPlasticTree = treeFactory.getTree(TreeTypes.PLASTIC);
        
        
        myBirchTree.make();
        myPineTree.make();
        myOakTree.make();
        myFirTree.make();
        myPlasticTree.make();
        
        TreeFacade facade = new TreeFacade();
        
        facade.placeBirch();
        facade.placeFir();
        facade.placeOak();
        facade.placePine();
        facade.placePlastic();
        
    }

}