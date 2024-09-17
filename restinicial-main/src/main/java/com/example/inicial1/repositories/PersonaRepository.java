package com.example.inicial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.inicial1.entities.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}