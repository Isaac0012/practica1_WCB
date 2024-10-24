package com.practica.eventos.repository;

import com.practica.eventos.model.Perito;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PeritoRepository {

    private List<Perito> peritos = new ArrayList<>();

    public List<Perito> findAll() {
        return peritos;
    }

    public Optional<Perito> findById(String id) {
        return peritos.stream().filter(perito -> perito.getId().equals(id)).findFirst();
    }

    public Perito save(Perito perito) {
        peritos.add(perito);
        return perito;
    }

    public void deleteById(String id) {
        peritos.removeIf(perito -> perito.getId().equals(id));
    }
}
