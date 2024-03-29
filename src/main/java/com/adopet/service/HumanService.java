package com.adopet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopet.model.entity.Human;
import com.adopet.repository.HumanRepository;
import com.adopet.service.interfaces.IHumanService;

@Service
public class HumanService implements IHumanService {

    @Autowired
    private HumanRepository iHumanRepository;

    @Override
    public Human save(Human human) {

        return iHumanRepository.saveAndFlush(human);
    }

    @Override
    public Human update(Human human) {

        return iHumanRepository.saveAndFlush(human);
    }

    @Override
    public void deleteByUsername(String username) {

        // iHumanRepository.deleteByUsername(username);
    }

    @Override
    public Human findByUsername(String username) {

        // return iHumanRepository.findByUsername(username);

        return new Human();
    }

    @Override
    public boolean nonExistsByCpf(String cpf) {
        return !iHumanRepository.existsByCpf(cpf);
    }

    @Override
    public Human findByCpf(String cpf) throws Exception {

        return iHumanRepository.findByCpf(cpf).orElseThrow(() -> new RuntimeException("Usuário não encontrado."));

    }

    @Override
    public boolean nonExistsByEmail(String cpf) {
        return !iHumanRepository.existsByEmail(cpf);

    }

}
