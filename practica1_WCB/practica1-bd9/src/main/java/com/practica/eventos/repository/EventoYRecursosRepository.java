package com.practica.eventos.repository;

import com.practica.eventos.model.EventoYRecursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventoYRecursosRepository {

    private List<EventoYRecursos> eventoYRecursosList = new ArrayList<>();

    public List<EventoYRecursos> findAll() {
        return eventoYRecursosList;
    }

    public Optional<EventoYRecursos> findById(String id) {
        return eventoYRecursosList.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public EventoYRecursos save(EventoYRecursos eventoYRecursos) {
        eventoYRecursosList.add(eventoYRecursos);
        return eventoYRecursos;
    }

    public void deleteById(String id) {
        eventoYRecursosList.removeIf(e -> e.getId().equals(id));
    }
}
