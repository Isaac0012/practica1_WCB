package com.practica.eventos.service;

import com.practica.eventos.model.EventoYRecursos;
import com.practica.eventos.repository.EventoYRecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoYRecursosService {

    @Autowired
    private EventoYRecursosRepository eventoYRecursosRepository;

    public List<EventoYRecursos> getAllEventoYRecursos() {
        return eventoYRecursosRepository.findAll();
    }

    public Optional<EventoYRecursos> getEventoYRecursosById(String id) {
        return eventoYRecursosRepository.findById(id);
    }

    public EventoYRecursos createEventoYRecursos(EventoYRecursos eventoYRecursos) {
        return eventoYRecursosRepository.save(eventoYRecursos);
    }

    public void deleteEventoYRecursos(String id) {
        eventoYRecursosRepository.deleteById(id);
    }
}
