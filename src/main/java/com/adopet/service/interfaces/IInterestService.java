package com.adopet.service.interfaces;

import com.adopet.model.entity.Human;

public interface IInterestService {

    void interestInApet(String humanCpf, Long petId) throws Exception;
    
}
