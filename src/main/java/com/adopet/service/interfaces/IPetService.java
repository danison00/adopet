package com.adopet.service.interfaces;

import java.util.List;
import com.adopet.model.entity.Human;
import com.adopet.model.entity.Pet;

public interface IPetService {

    Pet save(Pet pet);

    Pet update(Pet pet);

    void deleteById(Long id);

    Pet findById(Long id) throws Exception;

    List<Pet> findAll();

    List<Pet> findByHuman(Human human);



}
