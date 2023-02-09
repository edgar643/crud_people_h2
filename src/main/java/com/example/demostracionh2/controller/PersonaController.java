package com.example.demostracionh2.controller;

import com.example.demostracionh2.model.Persona;
import com.example.demostracionh2.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/h2")
public class PersonaController {
    private PersonaService personaService;
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersona() {
      return new ResponseEntity<>(personaService.getAllPersona(), HttpStatus.OK);
    }
}
