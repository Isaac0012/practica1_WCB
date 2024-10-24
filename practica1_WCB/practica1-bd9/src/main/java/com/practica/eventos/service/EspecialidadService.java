package com.practica.eventos.service;

import com.practica.eventos.model.Especialidad;
import com.practica.eventos.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> getAllEspecialidades() {
        return especialidadRepository.findAll();
    }

    public Optional<Especialidad> getEspecialidadById(String id) {
        return especialidadRepository.findById(id);
    }

    public Especialidad createEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    public void deleteEspecialidadById(String id) {
        especialidadRepository.deleteById(id);
    }
}
