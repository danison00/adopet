package com.adopet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToDonate;
import com.adopet.repository.PetToDonateRepository;
import com.adopet.service.interfaces.IPetToDonate;

public class PetToDonateService implements IPetToDonate {

    @Autowired
    private PetToDonateRepository iDonateRepository;

    @Override
    public PetToDonate save(PetToDonate pet) {
        return iDonateRepository.save(pet);
    }

    @Override
    public PetToDonate update(PetToDonate pet) {
        return save(pet);
    }

    @Override
    public void deleteById(Long id) {
        iDonateRepository.deleteById(id);
    }

    @Override
    public PetToDonate findById(Long id) {
        return iDonateRepository.findById(id).orElseThrow(() -> new RuntimeException("Pet não encontrado."));
    }

    @Override
    public List<PetToDonate> findAll() {
        return iDonateRepository.findAll();
    }

    @Override
    public List<PetToDonate> findByHuman(Human human) {
        return iDonateRepository.findByHuman(human);
    }

}
