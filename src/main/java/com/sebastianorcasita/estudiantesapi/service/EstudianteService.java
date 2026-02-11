package com.sebastianorcasita.estudiantesapi.service;

import com.sebastianorcasita.estudiantesapi.model.Estudiante;
import com.sebastianorcasita.estudiantesapi.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public void crearEstudiante(Estudiante estudiante) {
        if (repository.existePorId(estudiante.getId())) {
            throw new RuntimeException("El ID del estudiante ya está registrado en el sistema");
        }
        repository.guardar(estudiante);
    }

    public List<Estudiante> obtenerTodos() {
        return repository.listarTodos();
    }
}