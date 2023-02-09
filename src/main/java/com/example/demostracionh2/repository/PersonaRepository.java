package com.example.demostracionh2.repository;

import com.example.demostracionh2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;




public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
