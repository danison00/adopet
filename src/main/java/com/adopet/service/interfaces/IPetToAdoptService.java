package com.adopet.service.interfaces;

import java.util.List;
import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToAdopt;

public interface IPetToAdoptService {

    PetToAdopt save(PetToAdopt pet);

    PetToAdopt update(PetToAdopt pet);

    void deleteById(Long id);

    PetToAdopt findById(Long id);

    List<PetToAdopt> findAll();

    List<PetToAdopt> findByHuman(Human human);



}
