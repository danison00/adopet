package com.adopet.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adopet.service.interfaces.IHumanService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/verify-if-exists")
public class VerifyIfExists {

    @Autowired
    private IHumanService iHumanService;

    @GetMapping("/cpf")
    public ResponseEntity<HttpStatus> cpf(@PathParam("cpf") String cpf) {

        if (iHumanService.nonExistsByCpf(cpf))
            return ResponseEntity.ok().build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @GetMapping("/email")
    public ResponseEntity<HttpStatus> email(@PathParam("email") String email) {

        if (iHumanService.nonExistsByEmail(email))
            return ResponseEntity.ok().build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }
   @GetMapping("/username")
    public ResponseEntity<HttpStatus> username(@PathParam("username") String username) {


            return ResponseEntity.ok().build();



    }
}
