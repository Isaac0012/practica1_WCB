package com.practica.eventos.repository;

import com.practica.eventos.model.Sede;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SedeRepository {

    private List<Sede> sedes = new ArrayList<>();

    public List<Sede> findAll() {
        return sedes;
    }

    public Optional<Sede> findById(String id) {
        return sedes.stream().filter(sede -> sede.getId().equals(id)).findFirst();
    }

    public Sede save(Sede sede) {
        sedes.add(sede);
        return sede;
    }

    public void deleteById(String id) {
        sedes.removeIf(sede -> sede.getId().equals(id));
    }
}
