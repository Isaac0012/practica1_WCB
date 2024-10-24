package com.practica.eventos.repository;

import com.practica.eventos.model.Especialidad;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EspecialidadRepository {

    private List<Especialidad> especialidades = new ArrayList<>();

    public List<Especialidad> findAll() {
        return especialidades;
    }

    public Optional<Especialidad> findById(String id) {
        return especialidades.stream().filter(especialidad -> especialidad.getId().equals(id)).findFirst();
    }

    public Especialidad save(Especialidad especialidad) {
        especialidades.add(especialidad);
        return especialidad;
    }

    public void deleteById(String id) {
        especialidades.removeIf(especialidad -> especialidad.getId().equals(id));
    }
}
