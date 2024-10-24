package com.practica.eventos.controller;

import com.practica.eventos.model.Oficio;
import com.practica.eventos.service.OficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oficios")
public class OficioController {

    @Autowired
    private OficioService oficioService;

    @GetMapping
    public List<Oficio> getAllOficios() {
        return oficioService.getAllOficios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oficio> getOficioById(@PathVariable String id) {
        Optional<Oficio> oficio = oficioService.getOficioById(id);
        if (oficio.isPresent()) {
            return ResponseEntity.ok(oficio.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Oficio createOficio(@RequestBody Oficio oficio) {
        return oficioService.createOficio(oficio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOficio(@PathVariable String id) {
        Optional<Oficio> oficio = oficioService.getOficioById(id);
        if (oficio.isPresent()) {
            oficioService.deleteOficio(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
