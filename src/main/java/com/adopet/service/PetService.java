package com.adopet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.Pet;
import com.adopet.repository.PetRepository;
import com.adopet.service.interfaces.IPetService;

@Service
public class PetService implements IPetService {

    @Autowired
    private PetRepository iAdoptRepository;

    @Override
    public Pet save(Pet pet) {
        return iAdoptRepository.saveAndFlush(pet);
    }

    @Override
    public Pet update(Pet pet) {
        return save(pet);
    }

    @Override
    public void deleteById(Long id) {
        iAdoptRepository.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return iAdoptRepository.findById(id).orElseThrow(() -> new RuntimeException("Pet não encontrado."));
    }

    @Override
    public List<Pet> findAll() {
        return iAdoptRepository.findAll();
    }

    @Override
    public List<Pet> findByHuman(Human human) {

        return null;
    }

}
