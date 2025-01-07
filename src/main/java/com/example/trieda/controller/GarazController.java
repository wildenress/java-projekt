package com.example.trieda.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trieda.model.GarazModel;
import com.example.trieda.service.GarazService;


@RestController
public class GarazController {

    public final GarazService garazService;

    public GarazController(GarazService garazService) {
        this.garazService = garazService;
    }

    @GetMapping("/auta")
    public List<GarazModel> getAllCars() {
        // vrat vsetky auta v garazi
        return garazService.getAllCars();
    }

    @PostMapping("/auto")
    public void saveGaraz(@RequestBody GarazModel model) {
        garazService.saveGaraz(model);
    }
}
