package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetForAdoption;

public interface PetsForAdoptionRepository extends JpaRepository<PetForAdoption, Long> {
    
}
