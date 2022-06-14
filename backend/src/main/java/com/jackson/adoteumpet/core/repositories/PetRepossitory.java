package com.jackson.adoteumpet.core.repositories;

import com.jackson.adoteumpet.core.exceptions.PetNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jackson.adoteumpet.core.models.Pet;



public interface PetRepossitory extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id ) {
        var petOptional = findById(id);
        if (petOptional.isPresent()) {
            return petOptional.get();
        }
            throw new PetNotFoundException();

    }
    
}
