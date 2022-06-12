package com.jackson.adoteumpet.api.pet.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.api.pet.mappers.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.adoteumpet.core.models.Pet;
import com.jackson.adoteumpet.core.repositories.PetRepossitory;

@RestController
public class PetController {
    
    @Autowired
    private PetRepossitory petRepossitory;

    @Autowired
    private PetMapper petMapper;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {

        var pets = petRepossitory.findAll();
        var petResponses = new ArrayList<PetResponse>();
        for (Pet pet: pets) {
            petResponses.add(petMapper.toResponse(pet));
        }
        return petResponses;
    }
}
