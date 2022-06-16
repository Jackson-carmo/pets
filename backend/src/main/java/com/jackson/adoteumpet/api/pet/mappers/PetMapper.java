package com.jackson.adoteumpet.api.pet.mappers;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.core.models.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet) {

        return PetResponse.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .historia(pet.getHistoria())
                .foto(pet.getFoto())
                .build();
    }
}
