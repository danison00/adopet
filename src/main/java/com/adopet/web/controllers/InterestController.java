package com.adopet.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adopet.service.interfaces.IHumanService;
import com.adopet.service.interfaces.IInterestService;
import com.adopet.service.interfaces.IPetService;

@RestController
@RequestMapping("/interest")
public class InterestController {


    @Autowired
    private IInterestService iInterestService;

    @PostMapping()
    public ResponseEntity<HttpStatus> inAPet(@RequestParam() Long idPet) throws Exception {
        
       
        iInterestService.interestInApet("02757378291", Long.valueOf(1));

        return ResponseEntity.ok().build();


    }
    
}
