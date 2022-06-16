package com.jackson.adoteumpet.api.pet.services;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.api.pet.mappers.PetMapper;
import com.jackson.adoteumpet.core.repositories.PetRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService {

    @Autowired
    private PetRepossitory petRepossitory;

    @Autowired
    private PetMapper petMapper;

    public List<PetResponse> findAll() {

        return petRepossitory.findAll()
                .stream()
                .map(petMapper::toResponse)
                .collect(Collectors.toList());
    }
}
