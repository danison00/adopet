package com.adopet.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adopet.model.dto.PetDto;
import com.adopet.model.entity.Pet;
import com.adopet.service.interfaces.IHumanService;
import com.adopet.service.interfaces.IPetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IPetService iPetService;

    @Autowired
    private IHumanService iHumanService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PetDto petDto) {

        var human = iHumanService.findByCpf("02757378295");
        var pet = iPetService.save(new Pet(petDto, human));

        return ResponseEntity.status(HttpStatus.CREATED).body(pet.getDto());

    }

    @GetMapping("/list-all")
    public ResponseEntity<?> getMethodName() {
       var pets = this.iPetService.findAll();
       List<PetDto> petsDto = new ArrayList<PetDto>();
       
       for (Pet pet : pets) 
            petsDto.add(pet.getDto());
       
        return ResponseEntity.ok().body(petsDto);
    }

}
