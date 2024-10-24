package com.practica.eventos.service;

import com.practica.eventos.model.TipoDeEventos;
import com.practica.eventos.repository.TipoDeEventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDeEventosService {

    @Autowired
    private TipoDeEventosRepository tipoDeEventosRepository;

    public List<TipoDeEventos> getAllTiposDeEventos() {
        return tipoDeEventosRepository.findAll();
    }

    public Optional<TipoDeEventos> getTipoDeEventosById(String id) {
        return tipoDeEventosRepository.findById(id);
    }

    public TipoDeEventos createTipoDeEventos(TipoDeEventos tipoDeEventos) {
        return tipoDeEventosRepository.save(tipoDeEventos);
    }

    public void deleteTipoDeEventos(String id) {
        tipoDeEventosRepository.deleteById(id);
    }
}
