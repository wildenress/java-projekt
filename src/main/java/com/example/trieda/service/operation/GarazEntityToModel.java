package com.example.trieda.service.operation;


import org.springframework.stereotype.Component;

import com.example.trieda.model.GarazModel;
import com.example.trieda.persistence.GarazEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public enum GarazEntityToModel{
    FN;

    public List<GarazModel> fromEntity(List<GarazEntity> garazEntity){
        List<GarazModel> garazModels = new ArrayList<>();
        for (int x = 0; x < garazEntity.size(); x++) {
            GarazEntity singleEntity = garazEntity.get(x);

            GarazModel model = new GarazModel(singleEntity.getModel(), singleEntity.getVyrobca(), singleEntity.getPocet_km());
            
            garazModels.add(model);
        }
        return garazModels;
    }

}