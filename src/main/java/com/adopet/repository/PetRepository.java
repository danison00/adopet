package com.adopet.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    
}
