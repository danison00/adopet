package com.adopet.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adopet.model.dto.HumanDto;
import com.adopet.model.entity.Address;
import com.adopet.model.entity.Human;
import com.adopet.service.interfaces.IHumanService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
      info = @Info(
            title = "Adopet",
            version = "1.0",
            description = "Apis do sistema de adoção de pets Adopet",
            termsOfService = "dancodenow",
            contact = @Contact(
                  name= "Dânison dos Santos",
                  email="danison.santos00@gmail.com"
            ),
            license = @License(
                  name = "licence",
                  url = "https://github.io/danison00"
            )

      )
)
@RestController
@RequestMapping("human")
public class HumanController {

      @Autowired
      private IHumanService iHumanService;

      @PostMapping()
      public ResponseEntity<Human> save(@RequestBody HumanDto humanDto) {

            this.iHumanService.save(
                        new Human(humanDto, new Address(humanDto.adress()))
            );
            return ResponseEntity.status(HttpStatus.CREATED).build();
      }

}
