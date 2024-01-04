package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetsForAdoption;

public interface PetsForAdoptionRepository extends JpaRepository<PetsForAdoption, Long> {
    
}
