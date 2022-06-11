package com.jackson.adoteumpet.api.pet.mappers;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import com.jackson.adoteumpet.core.models.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet) {
        var petResponse = new PetResponse();
        petResponse.setId(pet.getId());
        petResponse.setNome(pet.getNome());
        petResponse.setHistoria(pet.getHistoria());
        petResponse.setFoto(pet.getFoto());
        return petResponse;
    }
}
