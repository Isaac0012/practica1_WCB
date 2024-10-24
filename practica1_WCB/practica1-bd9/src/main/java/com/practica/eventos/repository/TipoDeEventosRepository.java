package com.practica.eventos.repository;

import com.practica.eventos.model.TipoDeEventos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TipoDeEventosRepository {

    private List<TipoDeEventos> tiposDeEventos = new ArrayList<>();

    public List<TipoDeEventos> findAll() {
        return tiposDeEventos;
    }

    public Optional<TipoDeEventos> findById(String id) {
        return tiposDeEventos.stream().filter(evento -> evento.getId().equals(id)).findFirst();
    }

    public TipoDeEventos save(TipoDeEventos tipoDeEventos) {
        tiposDeEventos.add(tipoDeEventos);
        return tipoDeEventos;
    }

    public void deleteById(String id) {
        tiposDeEventos.removeIf(evento -> evento.getId().equals(id));
    }
}
