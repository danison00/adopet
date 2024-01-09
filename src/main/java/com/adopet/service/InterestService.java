package com.adopet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adopet.service.interfaces.IHumanService;
import com.adopet.service.interfaces.IInterestService;
import com.adopet.service.interfaces.IPetService;

@Service
public class InterestService implements IInterestService {

    @Autowired
    private IPetService iPetService;

    @Autowired
    private IHumanService ihumanService;

    @Override
    public void interestInApet(String humanCpf, Long petId) throws Exception {
        
        var pet = iPetService.findById(petId);
        var human = ihumanService.findByCpf(humanCpf);

        if(pet.getOwner().getId() == human.getId())
            throw new RuntimeException("Não é possível demonstrar interesse em seu próprio pet.");
        
        pet.setNumInteresses(pet.getNumInteresses()+1);
        pet.getInterestedHumans().add(human);

        this.iPetService.update(pet);
    }

}
