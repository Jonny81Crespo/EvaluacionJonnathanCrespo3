package com.example.EvaluacionJonnathanCrespo.controlador;

import com.example.EvaluacionJonnathanCrespo.datos.Datos;
import com.example.EvaluacionJonnathanCrespo.repositorio.Datosrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controlador {


    private final Servicio servicio;
    private final Datosrepositorio datosrepositorio;

    @Autowired
    public Controlador(Servicio servicio, Datosrepositorio datosrepositorio) {
        this.servicio = servicio;
        this.datosrepositorio = datosrepositorio;
    }

    @GetMapping("/insertardatos")
    public void insertardatos() {
         servicio.insertardatos();
    }

    @GetMapping("/titulos/{userId}")
    public List<String> obtenertitulos(@PathVariable Long userId) {
        return datosrepositorio.buscarporid(userId);
    }


}
