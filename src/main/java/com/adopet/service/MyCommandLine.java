package com.adopet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adopet.model.dto.AddressDto;
import com.adopet.model.dto.HumanDto;
import com.adopet.model.entity.Address;
import com.adopet.model.entity.Human;
import com.adopet.model.entity.Pet;
import com.adopet.service.interfaces.IHumanService;
import com.adopet.service.interfaces.IInterestService;
import com.adopet.service.interfaces.IPetService;

@Component
public class MyCommandLine implements CommandLineRunner {

    @Autowired
    private IHumanService iHumanService;
    @Autowired
    private IPetService iPetService;
    @Autowired
    private IInterestService iInterestService;

    @Override
    public void run(String... args) throws Exception {
        saveHumans();
        savePets();

        addInterested();
    }

    private void addInterested() {
        try {
            iInterestService.interestInApet("02757378291", Long.valueOf(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void savePets() {

        try {

            var human = iHumanService.findByCpf("02757378290");
            var pet = new Pet(null, "Pitty", "Cão", null, "femea", 2, false, false, "denho", null, true, 0, null, human,
                    null);

            iPetService.save(pet);
        } catch (Exception e) {
            System.out.println("erro ao encontrar humano");
        }

        System.out.println("Humano salvo");

    }

    void saveHumans() {
        var humanDto = new HumanDto(
                "Dânison dos Santos",
                24,
                "masculino",
                "02757378290",
                "91984733208",
                "dan@email.com", null);
        var address = new AddressDto(
                "Rua Fortaleza",
                "16A",
                "Bela Vista", "68440000", "Tucurui", "PA");

        var human = new Human(humanDto, new Address(address));

        human = iHumanService.save(human);

        var outraPessoaDto = new HumanDto(
                "Fernanda Oliveira",
                30,
                "feminino",
                "02757378291",
                "98765432100",
                "fernanda@email.com",
                null);

        var outroEnderecoDto = new AddressDto(
                "Avenida Brasil",
                "123",
                "Centro",
                "12345000",
                "Cidade Nova",
                "SP");

        var outraPessoa = new Human(outraPessoaDto, new Address(outroEnderecoDto));

        outraPessoa = iHumanService.save(outraPessoa);

        System.out.println("\n\nHumano salvo");
    }

}
