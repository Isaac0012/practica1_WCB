package com.practica.eventos.repository;

import com.practica.eventos.model.Oficio;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OficioRepository {

    private List<Oficio> oficios = new ArrayList<>();

    public List<Oficio> findAll() {
        return oficios;
    }

    public Optional<Oficio> findById(String id) {
        return oficios.stream().filter(oficio -> oficio.getId().equals(id)).findFirst();
    }

    public Oficio save(Oficio oficio) {
        oficios.add(oficio);
        return oficio;
    }

    public void deleteById(String id) {
        oficios.removeIf(oficio -> oficio.getId().equals(id));
    }
}
