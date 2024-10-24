package com.practica.eventos.controller;

import com.practica.eventos.model.Sede;
import com.practica.eventos.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sedes")
public class SedeController {

    @Autowired
    private SedeService sedeService;

    @GetMapping
    public List<Sede> getAllSedes() {
        return sedeService.getAllSedes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sede> getSedeById(@PathVariable String id) {
        Optional<Sede> sede = sedeService.getSedeById(id);
        if (sede.isPresent()) {
            return ResponseEntity.ok(sede.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Sede createSede(@RequestBody Sede sede) {
        return sedeService.createSede(sede);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSede(@PathVariable String id) {
        Optional<Sede> sede = sedeService.getSedeById(id);
        if (sede.isPresent()) {
            sedeService.deleteSede(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
