package com.adopet.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByOwnerId(Long id);
    
}
