package com.example.trieda.service;

import com.example.trieda.model.GarazModel;

import java.util.List;

public interface GarazService {
    void saveGaraz(GarazModel garazModel);

    List<GarazModel> getAllCars();
}
