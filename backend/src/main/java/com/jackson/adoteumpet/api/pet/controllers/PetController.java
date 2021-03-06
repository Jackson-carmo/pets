package com.jackson.adoteumpet.api.pet.controllers;

import java.util.List;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.api.pet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {

        return petService.findAll();
    }
}
