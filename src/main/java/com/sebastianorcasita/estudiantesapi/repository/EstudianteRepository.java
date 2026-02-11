package com.sebastianorcasita.estudiantesapi.repository;

import com.sebastianorcasita.estudiantesapi.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EstudianteRepository {

    private final Map<String, Estudiante> estudiantes = new HashMap<>();

    public boolean existePorId(String id) {
        return estudiantes.containsKey(id);
    }

    public void guardar(Estudiante estudiante) {
        estudiantes.put(estudiante.getId(), estudiante);
    }

    public List<Estudiante> listarTodos() {
        return new ArrayList<>(estudiantes.values());
    }
}