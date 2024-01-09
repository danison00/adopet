package com.adopet.service.interfaces;

import java.util.Optional;

import com.adopet.model.entity.Human;

public interface IHumanService {

    Human save(Human human);

    Human update(Human human);

    void deleteByUsername(String username);

    Human findByUsername(String username);

    boolean nonExistsByCpf(String cpf);

    boolean nonExistsByEmail(String cpf);

    Human findByCpf(String cpf) throws Exception;

}
