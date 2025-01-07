package com.example.trieda.model;

public class GarazModel {
    private final String model;
    private final String vyrobca;
    private final int km;
    
    
    public GarazModel(String model, String vyrobca, int km) {
        this.model = model;
        this.vyrobca = vyrobca;
        this.km = km;
    }


    public String getModel() {
        return model;
    }


    public String getVyrobca() {
        return vyrobca;
    }


    public int getKm() {
        return km;
    }

    
}
