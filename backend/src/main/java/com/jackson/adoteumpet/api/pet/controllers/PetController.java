package com.jackson.adoteumpet.api.pet.controllers;

import java.util.List;
import java.util.stream.Collectors;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.api.pet.mappers.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.adoteumpet.core.repositories.PetRepossitory;

@RestController
public class PetController {
    
    @Autowired
    private PetRepossitory petRepossitory;

    @Autowired
    private PetMapper petMapper;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {

        return petRepossitory.findAll()
                .stream()
                .map(petMapper::toResponse)
                .collect(Collectors.toList());
    }
}
