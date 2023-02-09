package com.example.demostracionh2.service.impl;

import com.example.demostracionh2.model.Persona;
import com.example.demostracionh2.repository.PersonaRepository;
import com.example.demostracionh2.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonaServiceImpl implements PersonaService {
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersona() {
        return personaRepository.findAll();
    }
}
