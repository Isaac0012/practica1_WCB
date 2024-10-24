package com.practica.eventos.controller;

import com.practica.eventos.model.Perito;
import com.practica.eventos.service.PeritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peritos")
public class PeritoController {

    @Autowired
    private PeritoService peritoService;

    @GetMapping
    public List<Perito> getAllPeritos() {
        return peritoService.getAllPeritos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perito> getPeritoById(@PathVariable String id) {
        Optional<Perito> perito = peritoService.getPeritoById(id);
        if (perito.isPresent()) {
            return ResponseEntity.ok(perito.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Perito createPerito(@RequestBody Perito perito) {
        return peritoService.createPerito(perito);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerito(@PathVariable String id) {
        Optional<Perito> perito = peritoService.getPeritoById(id);
        if (perito.isPresent()) {
            peritoService.deletePerito(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
