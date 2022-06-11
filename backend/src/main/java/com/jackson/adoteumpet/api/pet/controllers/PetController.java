package com.jackson.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.adoteumpet.core.models.Pet;
import com.jackson.adoteumpet.core.repositories.PetRepossitory;

@RestController
public class PetController {
    
    @Autowired
    private PetRepossitory petRepossitory;

    @GetMapping("/pets")
    public List<Pet> findAll() {
        return petRepossitory.findAll();
    }
}
