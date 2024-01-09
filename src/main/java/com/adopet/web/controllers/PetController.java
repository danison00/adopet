package com.adopet.web.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.adopet.model.dto.PetDto;
import com.adopet.model.entity.Pet;
import com.adopet.service.interfaces.IHumanService;
import com.adopet.service.interfaces.IPetService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private IPetService iPetService;

    @Autowired
    private IHumanService iHumanService;

    @PostMapping()
    public ResponseEntity<?> create(
            @RequestParam String especie,
            @RequestParam String nome,
            @RequestParam Integer idade,
            @RequestParam String sexo,
            @RequestParam Boolean castrado,
            @RequestParam Boolean cuidadosEspeciais,
            @RequestParam String caracteristicas,
            @RequestParam MultipartFile imagem) throws Exception {

        var petDto = new PetDto(
                null,
                imagem.getBytes(),
                nome,
                especie,
                sexo,
                idade,
                castrado,
                cuidadosEspeciais,
                caracteristicas);

        var human = iHumanService.findByCpf("02757378295");
        iPetService.save(new Pet(petDto, human));

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/list-all")
    public ResponseEntity<?> listAll() {
        var pets = this.iPetService.findAll();
        List<PetDto> petsDto = new ArrayList<PetDto>();

        for (Pet pet : pets)
            petsDto.add(pet.getDto());

        return ResponseEntity.ok().body(petsDto);
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<Pet> findById(@PathParam("id") Long id) throws Exception {

        var pet = this.iPetService.findById(id);

        return ResponseEntity.ok().body(pet);
    }

    @DeleteMapping("/delete-by-id")
    public ResponseEntity<HttpStatus> deleteById(@PathParam("id") Long id) throws Exception {

        this.iPetService.findById(id);
        iPetService.deleteById(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/my-pets/to-donate")
    public ResponseEntity<List<PetDto>> myPetsToDonate(@PathParam("humanId") Long humanId) throws Exception {

        List<Pet> pets = iPetService.findByHuman(humanId);

        List<PetDto> petDtos = new ArrayList<>();

        for (Pet pet : pets) 
            petDtos.add(pet.getDto());
        

        return ResponseEntity.ok().body(petDtos);
    }

}
