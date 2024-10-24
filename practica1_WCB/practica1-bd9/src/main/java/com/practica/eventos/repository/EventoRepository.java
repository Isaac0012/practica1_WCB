package com.practica.eventos.repository;

import com.practica.eventos.model.Evento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventoRepository {

    private List<Evento> eventos = new ArrayList<>();

    public List<Evento> findAll() {
        return eventos;
    }

    public Optional<Evento> findById(String id) {
        return eventos.stream().filter(evento -> evento.getId().equals(id)).findFirst();
    }

    public Evento save(Evento evento) {
        eventos.add(evento);
        return evento;
    }

    public void deleteById(String id) {
        eventos.removeIf(evento -> evento.getId().equals(id));
    }
}
