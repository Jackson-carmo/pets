package com.jackson.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackson.adoteumpet.core.models.Pet;

public interface PetRepossitory extends JpaRepository<Pet, Long> {
    
}
