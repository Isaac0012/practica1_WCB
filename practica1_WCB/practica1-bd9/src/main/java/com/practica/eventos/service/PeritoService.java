package com.practica.eventos.service;

import com.practica.eventos.model.Perito;
import com.practica.eventos.repository.PeritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeritoService {

    @Autowired
    private PeritoRepository peritoRepository;

    public List<Perito> getAllPeritos() {
        return peritoRepository.findAll();
    }

    public Optional<Perito> getPeritoById(String id) {
        return peritoRepository.findById(id);
    }

    public Perito createPerito(Perito perito) {
        return peritoRepository.save(perito);
    }

    public void deletePerito(String id) {
        peritoRepository.deleteById(id);
    }
}
