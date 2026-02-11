package com.sebastianorcasita.estudiantesapi.controller;

import com.sebastianorcasita.estudiantesapi.model.Estudiante;
import com.sebastianorcasita.estudiantesapi.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> crear(@RequestBody Estudiante estudiante) {
        service.crearEstudiante(estudiante);
        return ResponseEntity.status(201).body("Estudiante creado");
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> listar() {
        return ResponseEntity.ok(service.obtenerTodos());
    }
}