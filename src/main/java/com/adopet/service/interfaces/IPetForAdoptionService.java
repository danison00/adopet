package com.adopet.service.interfaces;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.Pet;
import com.adopet.model.entity.PetsForAdoption;

public interface IPetForAdoptionService {

    Pets save(Pets human);

    Pets update(Pets hPets;

    void deleteById(Long id);

    PetsForAdoption findById(Long id);

}
