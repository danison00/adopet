package com.adopet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToAdopt;
import com.adopet.repository.PetToAdoptRepository;
import com.adopet.service.interfaces.IPetToAdoptService;

public class PetToAdoptService implements IPetToAdoptService {

    @Autowired
    private PetToAdoptRepository iAdoptRepository;

    @Override
    public PetToAdopt save(PetToAdopt pet) {
        return iAdoptRepository.saveAndFlush(pet);
    }

    @Override
    public PetToAdopt update(PetToAdopt pet) {
        return save(pet);
    }

    @Override
    public void deleteById(Long id) {
        iAdoptRepository.deleteById(id);
    }

    @Override
    public PetToAdopt findById(Long id) {
        return iAdoptRepository.findById(id).orElseThrow(() -> new RuntimeException("Pet não encontrado."));
    }

    @Override
    public List<PetToAdopt> findAll() {
        return iAdoptRepository.findAll();
    }

    @Override
    public List<PetToAdopt> findByHuman(Human human) {
        return iAdoptRepository.findByHuman(human);
    }

}
