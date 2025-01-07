package com.example.trieda.service.operation;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.trieda.model.GarazModel;
import com.example.trieda.persistence.GarazRepository;



@Component
public class GetGarazOperation {
    private final GarazRepository garazRepository;

    public GetGarazOperation(GarazRepository garazRepository) {
        this.garazRepository = garazRepository;
    }

    public List<GarazModel> getAllCars() {
        return GarazEntityToModel.FN.fromEntity(garazRepository.findAll());
    }
}
