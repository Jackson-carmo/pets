package com.jackson.adoteumpet.core.repositories;

import com.jackson.adoteumpet.core.exceptions.PetNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jackson.adoteumpet.core.models.Pet;



public interface PetRepossitory extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id ) {
        return findById(id)
                .orElseThrow(PetNotFoundException::new);

    }
    
}
