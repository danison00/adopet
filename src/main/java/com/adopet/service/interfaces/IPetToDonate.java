package com.adopet.service.interfaces;

import java.util.List;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToDonate;

public interface IPetToDonate {

    PetToDonate save(PetToDonate pet);

    PetToDonate update(PetToDonate pet);

    void deleteById(Long id);

    PetToDonate findById(Long id);

    List<PetToDonate> findAll();

    List<PetToDonate> findByHuman(Human human);
    
}
