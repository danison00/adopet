package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetForAdoption;

public interface PetForAdoptionRepository extends JpaRepository<PetForAdoption, Long> {
    
}
