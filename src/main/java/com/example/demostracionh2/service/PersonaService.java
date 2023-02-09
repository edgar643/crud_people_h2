package com.example.demostracionh2.service;

import com.example.demostracionh2.controller.PersonaController;
import com.example.demostracionh2.model.Persona;
import jakarta.persistence.GeneratedValue;

import java.util.List;

public interface PersonaService {


    public List<Persona> getAllPersona();
}
