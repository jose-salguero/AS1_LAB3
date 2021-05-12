package com.salguerotrees;

import java.util.*;

public class TreeFacade {
    
    private List<String> PineSerialNumber;

    private List<String> OakSerialNumber;

    private List<String> FirSerialNumber;

    private List<String> BirchSerialNumber;

    private List<String> PlasticSerialNumber;
    
    
    public TreeFacade() {
        this.BirchSerialNumber = new ArrayList();
        this.FirSerialNumber = new ArrayList();
        this.OakSerialNumber = new ArrayList();
        this.PineSerialNumber = new ArrayList();
        this.PlasticSerialNumber = new ArrayList();
        
        this.BirchSerialNumber.add("BT100");
        this.BirchSerialNumber.add("BT200");
        this.BirchSerialNumber.add("BT300");
        this.BirchSerialNumber.add("BT400");
        this.BirchSerialNumber.add("BT500");
        
        this.FirSerialNumber.add("FT100");
        this.FirSerialNumber.add("FT200");
        this.FirSerialNumber.add("FT300");
        this.FirSerialNumber.add("FT400");
        this.FirSerialNumber.add("FT500");
        
        this.OakSerialNumber.add("OT100");
        this.OakSerialNumber.add("OT200");
        this.OakSerialNumber.add("OT300");
        this.OakSerialNumber.add("OT400");
        this.OakSerialNumber.add("OT500");
        
        this.PineSerialNumber.add("PT100");
        this.PineSerialNumber.add("PT200");
        this.PineSerialNumber.add("PT300");
        this.PineSerialNumber.add("PT400");
        this.PineSerialNumber.add("PT500");
        
        this.PlasticSerialNumber.add("PLT100");
        this.PlasticSerialNumber.add("PLT200");
        this.PlasticSerialNumber.add("PLT300");
        this.PlasticSerialNumber.add("PLT400");
        this.PlasticSerialNumber.add("PLT500");
    }

    
    
    public void placePine() {
         Trees treePine = new PineTree();
         
        for (int i = 0; i < PineSerialNumber.size(); i++){
          treePine.place(PineSerialNumber.get(i));
        }
        }
    

    public void placeOak() {
        Trees treeOak = new OakTree();
        
        for(int i = 0; i < OakSerialNumber.size(); i++){
            treeOak.place(OakSerialNumber.get(i));
        }
        }

    public void placeFir() {
        Trees treeFir = new FirTree();
        
        for(int i = 0; i < FirSerialNumber.size(); i++){
            treeFir.place(FirSerialNumber.get(i));
        }
    }

    public void placeBirch() {
        Trees treeBirch = new BirchTree();
        
        for(int i = 0; i < BirchSerialNumber.size(); i++){
            treeBirch.place(BirchSerialNumber.get(i));
        }
    }

    public void placePlastic() {
        Trees treePlastic = new PlasticTree();
        
        for(int i = 0; i < PlasticSerialNumber.size(); i++){
            treePlastic.place(PlasticSerialNumber.get(i));
        }
    }

}

