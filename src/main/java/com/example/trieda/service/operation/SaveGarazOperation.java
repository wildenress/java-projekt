package com.example.trieda.service.operation;

import org.springframework.stereotype.Component;

import com.example.trieda.model.GarazModel;
import com.example.trieda.persistence.GarazEntity;
import com.example.trieda.persistence.GarazRepository;

@Component
public class SaveGarazOperation {
    private final GarazRepository garazRepository;


    public SaveGarazOperation(GarazRepository garazRepository) {
        this.garazRepository = garazRepository;
    }

    public void saveGaraz(GarazModel model) {
        GarazEntity garazEntity = new GarazEntity(model.getModel(), model.getVyrobca(), model.getKm());

        garazRepository.saveAndFlush(garazEntity);
    }
}
