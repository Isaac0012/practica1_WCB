package com.practica.eventos.service;

import com.practica.eventos.model.Oficio;
import com.practica.eventos.repository.OficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OficioService {

    @Autowired
    private OficioRepository oficioRepository;

    public List<Oficio> getAllOficios() {
        return oficioRepository.findAll();
    }

    public Optional<Oficio> getOficioById(String id) {
        return oficioRepository.findById(id);
    }

    public Oficio createOficio(Oficio oficio) {
        return oficioRepository.save(oficio);
    }

    public void deleteOficio(String id) {
        oficioRepository.deleteById(id);
    }
}
