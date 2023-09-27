package com.example.EvaluacionJonnathanCrespo.controlador;

import com.example.EvaluacionJonnathanCrespo.datos.Datos;
import com.example.EvaluacionJonnathanCrespo.repositorio.Datosrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Servicio {

    private final RestTemplate restTemplate;
    private final Datosrepositorio datosrepositorio;

    @Autowired
    public Servicio(RestTemplate restTemplate,Datosrepositorio datosrepositorio) {
        this.restTemplate = restTemplate;
        this.datosrepositorio = datosrepositorio;
    }

    public void insertardatos() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        Datos[] posts = restTemplate.getForObject(url, Datos[].class);


        if (posts != null) {
            for (Datos post : posts) {
                datosrepositorio.save(post); // Guarda cada entrada en la base de datos
            }
        }
    }
    public List<String> obtenertitulos(Long userId) {
        return datosrepositorio.buscarporid(userId);
    }
}
