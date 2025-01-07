package com.example.trieda.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "garaz")
public class GarazEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name = "vyrobca")
    private String vyrobca;

    @Column(name = "pocet_km")
    private int pocet_km;


    public GarazEntity(String model, String vyrobca, int pocet_km){
        this.model = model;
        this.vyrobca = vyrobca;
        this.pocet_km = pocet_km;
    }

    public String getModel() {
        return model;
    }


    public String getVyrobca() {
        return vyrobca;
    }


    public int getPocet_km() {
        return pocet_km;
    }

    
}
