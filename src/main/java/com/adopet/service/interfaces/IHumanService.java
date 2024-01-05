package com.adopet.service.interfaces;

import com.adopet.model.entity.Human;

public interface IHumanService {

    Human save(Human human);

    Human update(Human human);

    void deleteByUsername(String username);

    Human findByUsername(String username);

}
