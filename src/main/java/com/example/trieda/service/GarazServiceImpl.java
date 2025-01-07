package com.example.trieda.service;

import com.example.trieda.model.GarazModel;
import java.util.List;
import com.example.trieda.service.operation.*;

import org.springframework.stereotype.Component;

@Component
public class GarazServiceImpl implements GarazService{
    
    private final GetGarazOperation getGarazOperation;
    private final SaveGarazOperation saveGarazOperation;


    public GarazServiceImpl(GetGarazOperation getGarazOperation, SaveGarazOperation saveGarazOperation) {
        this.getGarazOperation = getGarazOperation;
        this.saveGarazOperation = saveGarazOperation;
    }


    @Override
    public void saveGaraz(GarazModel garazModel) {
        saveGarazOperation.saveGaraz(garazModel);
    }

    @Override
    public List<GarazModel> getAllCars() {
        return getGarazOperation.getAllCars();
    }
}
