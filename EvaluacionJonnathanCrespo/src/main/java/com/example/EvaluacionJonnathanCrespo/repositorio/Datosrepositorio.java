package com.example.EvaluacionJonnathanCrespo.repositorio;

import com.example.EvaluacionJonnathanCrespo.datos.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Datosrepositorio extends JpaRepository<Datos,Integer> {

    @Query("SELECT p.title FROM Datos p WHERE p.userId = :userId")
    List<String> buscarporid(Long userId);
}
